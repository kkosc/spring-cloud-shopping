package pl.training.shopping.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.shopping.shoppingservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
