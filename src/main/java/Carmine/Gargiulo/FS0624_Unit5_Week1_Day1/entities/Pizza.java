package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Pizza extends MenuProduct{
    private List<Topping> toppingList;
    public Pizza(double price, int calories, List<Topping> toppingList) {
        super(price, calories);
        this.toppingList = toppingList;
    }

}
