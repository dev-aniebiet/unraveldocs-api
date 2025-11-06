package com.extractor.unraveldocs;

import com.extractor.unraveldocs.shared.response.UnravelDocsDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RootController {
    @GetMapping("/")
    public ResponseEntity<UnravelDocsDataResponse<Void>> rootEndpoint() {
        UnravelDocsDataResponse<Void> response = new UnravelDocsDataResponse<>(
                200,
                "success",
                "UnravelDocs API is running. Current server time: " + Instant.now().toString(),
                null
        );
        return ResponseEntity.ok(response);
    }
}
