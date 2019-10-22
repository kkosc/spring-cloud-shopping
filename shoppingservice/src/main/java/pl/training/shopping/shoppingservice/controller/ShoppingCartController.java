package pl.training.shopping.shoppingservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.training.shopping.shoppingservice.dto.ProductPiecesDto;
import pl.training.shopping.shoppingservice.service.ShoppingCartService;

@RestController
@RequiredArgsConstructor
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @PostMapping("/shopping-carts/{userId}")
    public void addProductToShoppingCart(@PathVariable Long userId, @RequestBody ProductPiecesDto productPiecesDto){
        shoppingCartService.addProductToShoppingCart(productPiecesDto, userId);
    }
}
