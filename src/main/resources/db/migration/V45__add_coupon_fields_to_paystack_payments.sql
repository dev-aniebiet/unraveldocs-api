-- Add coupon tracking fields to paystack_payments table
ALTER TABLE paystack_payments ADD COLUMN coupon_code VARCHAR(50);
ALTER TABLE paystack_payments ADD COLUMN original_amount DECIMAL(10, 2);
ALTER TABLE paystack_payments ADD COLUMN discount_amount DECIMAL(10, 2);

-- Create index for coupon code lookups
CREATE INDEX idx_paystack_coupon_code ON paystack_payments(coupon_code);
