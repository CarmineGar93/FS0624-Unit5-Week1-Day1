package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class AppConfig {
    @Bean
    public Topping getTomato(){
        Topping topping = new Topping(0.5, 50);
        topping.setName("Tomato");
        return topping;
    }

    @Bean
    public Topping getCheese(){
        Topping topping = new Topping(0.69, 92);
        topping.setName("Cheese");
        return topping;
    }

    @Bean
    public Topping getSausage(){
        Topping topping = new Topping(0.99, 40);
        topping.setName("Sausage");
        return topping;
    }

    @Bean
    public Topping getMushrooms(){
        Topping topping = new Topping(0.69, 22);
        topping.setName("Mushrooms");
        return topping;
    }

    @Bean
    public Topping getSalame(){
        Topping topping = new Topping(0.99, 86);
        topping.setName("Spicy salame");
        return topping;
    }

    @Bean
    public Topping getMelanzane(){
        Topping topping = new Topping(0.59, 40);
        topping.setName("Eggplant");
        return topping;
    }

    @Bean
    public List<Topping> getToppingBase(){
        return Arrays.asList(getCheese(), getTomato());
    }

    @Bean
    public Pizza getPizzaMargherita(){
        Pizza pizza = new Pizza(4.99, 1104, Arrays.asList(getTomato(), getCheese()));
        pizza.setName("Pizza Margherita");
        return pizza;
    }

    @Bean
    public Pizza getPizzaSalsicciaFunghi(){
        Pizza pizza = new Pizza(6.99, 1180, Arrays.asList(getTomato(), getSalame(), getSausage(), getMushrooms()));
        pizza.setName("Pizza sausage and mushrooms");
        return pizza;
    }

    @Bean
    public Pizza getPizzaDiavola(){
        Pizza pizza = new Pizza(5.99, 1160, Arrays.asList(getTomato(), getCheese(), getSalame()));
        pizza.setName("Pizza diavola");
        return pizza;
    }

    @Bean
    public Pizza getPizzaMelanzaneSalsiccia(){
        Pizza pizza = new Pizza(7.99, 1120, Arrays.asList(getTomato(), getCheese(), getSausage(), getMelanzane()));
        pizza.setName("Pizza sausage and eggplant");
        return pizza;
    }

    @Bean
    public Drink getCocaCola(){
        Drink drink = new Drink(2, 150, 0.5);
        drink.setName("Coca cola");
        return drink;
    }

    @Bean
    public Drink getWater(){
        Drink drink = new Drink(1, 0, 1);
        drink.setName("Water");
        return drink;
    }

    @Bean
    public Drink getFanta(){
        Drink drink = new Drink(1.5, 120, 0.33);
        drink.setName("Fanta");
        return drink;
    }

    @Bean
    public Drink getBeer(){
        Drink drink = new Drink(3, 250, 0.66);
        drink.setName("Beer");
        return drink;
    }

    @Bean(name = "menu")
    public Menu getMenu(List<MenuProduct> menuProductList){
        Menu menu = new Menu(menuProductList);
        return menu;
    }
}
