package com.extractor.unraveldocs.config;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "stripe")
@Data
public class StripeConfig {
    private String apiKey;
    private String webhookSecret;
    private String productId;
    private String priceId;
    private String customerPortalUrl;
    private String checkoutSessionUrl;
    private String subscriptionId;
    private String cancelSubscriptionUrl;
    private String updateSubscriptionUrl;

    @PostConstruct
    public void init() {
        Stripe.apiKey = this.apiKey;
    }
}
