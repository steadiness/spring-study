package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price; //int로 두면 값을 비워둘 수 없다.
    private Integer quantity;

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
