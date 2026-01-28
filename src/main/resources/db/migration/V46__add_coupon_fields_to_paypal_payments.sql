-- Add coupon fields to paypal_payments table
ALTER TABLE paypal_payments ADD COLUMN coupon_code VARCHAR(50);
ALTER TABLE paypal_payments ADD COLUMN original_amount DECIMAL(10, 2);
ALTER TABLE paypal_payments ADD COLUMN discount_amount DECIMAL(10, 2);

-- Create index for coupon_code
CREATE INDEX idx_paypal_coupon_code ON paypal_payments(coupon_code);
