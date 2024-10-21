package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities;

public class Topping extends MenuProduct{
    public Topping(double price, int calories) {
        super(price, calories);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
