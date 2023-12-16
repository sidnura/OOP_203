package Factory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.Latte);
        System.out.println("Created a " + coffee.getClass().getSimpleName());

    }
}