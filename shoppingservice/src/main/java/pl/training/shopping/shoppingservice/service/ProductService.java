package pl.training.shopping.shoppingservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.training.shopping.shoppingservice.dto.ProductPiecesDto;
import pl.training.shopping.shoppingservice.dto.ProductDto;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.model.ShoppingCart;
import pl.training.shopping.shoppingservice.model.User;
import pl.training.shopping.shoppingservice.repository.ProductRepository;
import pl.training.shopping.shoppingservice.repository.ShoppingCartRepository;
import pl.training.shopping.shoppingservice.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ShoppingCartRepository shoppingCartRepository;

    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.getOne(id);
    }

    public void createProduct(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPieces(productDto.getPieces());
        product.setUnitPrice(productDto.getUnitPrice());
        productRepository.save(product);
    }

    public void decrementProductsNumber(ProductPiecesDto productDto){
        Product product = productRepository.getOne(productDto.getId());
        product.decrement(productDto.getPieces());
    }

    public void addProductToShoppingCart(ProductPiecesDto productPiecesDto, Long userId){
        User user = userRepository.getOne(userId);
        Product product = productRepository.getOne(productPiecesDto.getId());
        ShoppingCart shoppingCart;
        if(user.getShoppingCart() == null){
            shoppingCart = new ShoppingCart();
        } else {
            shoppingCart = user.getShoppingCart();
            shoppingCart.setUser(user);
        }
        shoppingCart.getProductList().add(product);
        shoppingCart.setPieces(productPiecesDto.getPieces());
        shoppingCartRepository.save(shoppingCart);
    }

}
