package com.extractor.unraveldocs.coupon.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Wrapper response DTO for coupon usage list with totals.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponUsageResponse {
    private List<UsageEntry> usages;
    private int totalUsageCount;
    private BigDecimal totalDiscountAmount;

    /**
     * Individual usage entry DTO.
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UsageEntry {
        private String id;
        private UserInfo user;
        private BigDecimal originalAmount;
        private BigDecimal discountAmount;
        private BigDecimal finalAmount;
        private String subscriptionPlan;
        private String paymentReference;
        private String usedAt;
    }

    /**
     * Nested user information DTO.
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInfo {
        private String id;
        private String email;
        private String name;
    }
}
