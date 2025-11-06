package com.extractor.unraveldocs.appstart;

import com.extractor.unraveldocs.shared.response.UnravelDocsDataResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Tag(name = "Unraveldocs API Start App", description = "The root for starting unraveldocs")
public class AppStartController {
    @Operation(
            summary = "App Starting Point",
            description = "Starts the unraveldocs application"
    )
    @GetMapping
    public ResponseEntity<UnravelDocsDataResponse<String>> appStart() {

        UnravelDocsDataResponse<String> response = new UnravelDocsDataResponse<>();
        response.setStatusCode(HttpStatus.OK.value());
        response.setStatus("success");
        response.setMessage("Welcome to UnravelDocs API");
        response.setData(null);

        return ResponseEntity.ok(response);
    }
}
