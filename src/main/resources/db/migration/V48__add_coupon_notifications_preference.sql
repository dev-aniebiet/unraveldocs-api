-- =====================================================
-- V48: Add Coupon Notifications Preference Column
-- =====================================================
-- Adds a coupon_notifications column to allow users to
-- control whether they receive coupon-related notifications.
-- =====================================================

ALTER TABLE notification_preferences 
ADD COLUMN coupon_notifications BOOLEAN DEFAULT TRUE NOT NULL;
