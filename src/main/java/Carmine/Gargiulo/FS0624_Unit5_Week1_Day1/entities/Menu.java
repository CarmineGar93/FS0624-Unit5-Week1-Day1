package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Menu {
    private List<MenuProduct> productList;
    public void stampaMenu(){
        int distanzaPizzaCalorie = 90;
        int distanzaCaloriePrezzo = 20;
        String pizzas = "Pizzas";
        String calories = "Calories";
        String price = "Price";
        String toppings = "Toppings";
        String drinks = "Drinks";
        System.out.print("Pizzas");
        for (int i = 0; i < distanzaPizzaCalorie - pizzas.length(); i++) {
            System.out.print(" ");
        }
        System.out.print("Calories");
        for (int i = 0; i < distanzaCaloriePrezzo - calories.length(); i++) {
            System.out.print(" ");
        }
        System.out.print("Price");
        List<MenuProduct> pizzaList = productList.stream().filter(menuProduct -> menuProduct instanceof Pizza).toList();
        pizzaList.forEach(menuProduct -> {
            System.out.println();
            System.out.print(menuProduct.getName() + ((Pizza) menuProduct).getToppingList().toString());
            for (int i = 0; i < distanzaPizzaCalorie - menuProduct.getName().length() - ((Pizza) menuProduct).getToppingList().toString().length(); i++) {
                System.out.print(" ");
            }
            System.out.print(menuProduct.getCalories());
            for (int i = 0; i < distanzaCaloriePrezzo -Integer.toString(menuProduct.getCalories()).length(); i++) {
                System.out.print(" ");
            }
            System.out.print(menuProduct.getPrice());
        });
    }
}
