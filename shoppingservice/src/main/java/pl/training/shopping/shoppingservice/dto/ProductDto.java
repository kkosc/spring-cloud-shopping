package pl.training.shopping.shoppingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

    private String name;
    private Long pieces;
    private Long unitPrice;
}
