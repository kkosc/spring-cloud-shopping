package pl.training.shopping.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}
