package pl.training.shopping.shoppingservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class ShoppingCart {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "shoppingCart")
    private List<Product> productList = new ArrayList<>();
    private Long pieces;
    private String status;
    private Long paymentId;
}
