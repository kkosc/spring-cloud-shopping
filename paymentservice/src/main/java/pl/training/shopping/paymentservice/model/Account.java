package pl.training.shopping.paymentservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Account {
    @GeneratedValue
    @Id
    private Long id;
    private Long userId;
    private Long balance;
}
