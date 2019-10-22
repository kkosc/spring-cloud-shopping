package pl.training.shopping.shoppingservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.training.shopping.shoppingservice.dto.ProductDto;
import pl.training.shopping.shoppingservice.dto.ProductPiecesDto;
import pl.training.shopping.shoppingservice.model.Product;
import pl.training.shopping.shoppingservice.model.ShoppingCart;
import pl.training.shopping.shoppingservice.model.User;
import pl.training.shopping.shoppingservice.repository.ProductRepository;
import pl.training.shopping.shoppingservice.repository.ShoppingCartRepository;
import pl.training.shopping.shoppingservice.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ShoppingCartRepository shoppingCartRepository;

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
