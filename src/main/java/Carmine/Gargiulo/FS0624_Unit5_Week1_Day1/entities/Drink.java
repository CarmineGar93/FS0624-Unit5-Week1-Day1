package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities;




public class Drink extends MenuProduct{
    private double qty;
    public Drink(double price, int calories, double qty) {
        super(price, calories);
        this.qty = qty;
    }
}
