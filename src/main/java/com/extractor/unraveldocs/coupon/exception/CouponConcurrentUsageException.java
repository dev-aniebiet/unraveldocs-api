package com.extractor.unraveldocs.coupon.exception;

/**
 * Exception thrown when a coupon usage increment fails due to concurrent
 * access.
 * This occurs when optimistic locking detects that another transaction has
 * modified the coupon's usage count.
 */
public class CouponConcurrentUsageException extends RuntimeException {

    public CouponConcurrentUsageException(String message) {
        super(message);
    }

    public CouponConcurrentUsageException(String message, Throwable cause) {
        super(message, cause);
    }
}
