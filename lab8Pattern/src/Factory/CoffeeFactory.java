package Factory;

import java.io.IOException;

abstract class Coffee{}
class Espresso extends Coffee {}
class Americano extends Coffee {}
class Cappuccino extends Coffee {}
class Latte extends Coffee {}
class Mocha extends Coffee {}

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType fruitsType) throws IOException {
        switch (fruitsType) {
            case Espresso:
                return new Espresso();
            case Americano:
                return new Americano();
            case Cappuccino:
                return new Cappuccino();
            case Latte:
                return new Latte();
            default:
                throw new IOException("don't have such coffee");
        }
    }

}

