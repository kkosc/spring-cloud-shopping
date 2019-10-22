package pl.training.shopping.shoppingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.getOne(id);
    }
}
