package Adapter;

public class Main {
    public static void main(String[] args) {
        Burger pizzaAdapter = new PizzaAdapter(new Pizza());
        pizzaAdapter.usbConnect();

        Pizza burgerdapter = new Burgerdapter(new Burger());
        burgerdapter.typeCConnect();
    }
}