package pl.training.shopping.paymentservice.dto;

import lombok.Data;

@Data
public class PaymentInputDto {
    private Long userId;
    private Long totalPrice;
}
