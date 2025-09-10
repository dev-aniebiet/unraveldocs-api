package com.extractor.unraveldocs.events;

import com.extractor.unraveldocs.config.EmailRabbitMQConfig;
import com.extractor.unraveldocs.messaging.dto.EmailMessage;
import com.extractor.unraveldocs.messaging.emailservice.EmailOrchestratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailQueueConsumer {
    private final EmailOrchestratorService emailOrchestratorService;

    @RabbitListener(queues = EmailRabbitMQConfig.QUEUE_NAME)
    public void handleEmailRequest(EmailMessage emailMessage) {
        log.info("Received email request for: {}", emailMessage.getTo());
        try {
            emailOrchestratorService.sendEmail(emailMessage);
            log.info("Email sent to: {}", emailMessage.getTo());
        } catch (Exception e) {
            log.error("Failed to send email to {}: {}", emailMessage.getTo(), e.getMessage(), e);
            throw e; // Rethrow to trigger retry or dead-lettering
        }
    }
}
