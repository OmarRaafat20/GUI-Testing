package main.java.Models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class ShoppingCart {
    private Integer subTotal;
    private Integer amount;
}
