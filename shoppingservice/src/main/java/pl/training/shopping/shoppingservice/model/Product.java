package pl.training.shopping.shoppingservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long pieces;
    private Long unitPrice;
    @ManyToOne
    private ShoppingCart shoppingCart;

    public void decrement(Long pieces){
        this.pieces = this.pieces - pieces;
    }
}
