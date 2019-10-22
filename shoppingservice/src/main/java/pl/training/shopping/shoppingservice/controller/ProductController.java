package pl.training.shopping.shoppingservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.training.shopping.shoppingservice.dto.ProductPiecesDto;
import pl.training.shopping.shoppingservice.dto.ProductDto;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public void createProduct(@RequestBody ProductDto productDto){
        productService.createProduct(productDto);
    }

    @PatchMapping("/products/{id}")
    public void decrementProductsNumber(@RequestBody ProductPiecesDto productDto){
        productService.decrementProductsNumber(productDto);
    }

    @PostMapping("/shopping-carts/{userId}")
    public void addProductToShoppingCart(@PathVariable Long userId, @RequestBody ProductPiecesDto productPiecesDto){
        productService.addProductToShoppingCart(productPiecesDto, userId);
    }

}
