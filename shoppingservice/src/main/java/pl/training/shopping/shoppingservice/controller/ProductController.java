package pl.training.shopping.shoppingservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.service.ProductService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    private List<Product> getProductList(){
        return productService.getProductList();
    }

    @GetMapping("/products/{id}")
    private Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
}
