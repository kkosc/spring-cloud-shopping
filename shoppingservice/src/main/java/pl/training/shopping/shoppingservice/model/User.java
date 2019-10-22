package pl.training.shopping.shoppingservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @OneToOne
    private ShoppingCart shoppingCart;
}
