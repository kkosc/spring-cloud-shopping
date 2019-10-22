package pl.training.shopping.paymentservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Payment {

    @GeneratedValue
    @Id
    private Long id;

    @OneToOne
    private Account account;
    private Long totalPrice;
    private Long correlationId;
}
