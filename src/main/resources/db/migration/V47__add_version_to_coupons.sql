-- =====================================================
-- V47: Add Version Column to Coupons for Optimistic Locking
-- =====================================================
-- Adds a version column to the coupons table to prevent
-- race conditions when multiple requests try to increment
-- usage count simultaneously.
-- =====================================================

ALTER TABLE coupons ADD COLUMN version BIGINT DEFAULT 0 NOT NULL;
