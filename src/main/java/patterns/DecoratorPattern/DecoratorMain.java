package main.java.patterns.DecoratorPattern;

import main.java.patterns.DecoratorPattern.Pizza.BasePizza;
import main.java.patterns.DecoratorPattern.Pizza.Margherita;
import main.java.patterns.DecoratorPattern.Pizza.MushroomMagic;
import main.java.patterns.DecoratorPattern.Toppings.ExtraCheese;
import main.java.patterns.DecoratorPattern.Toppings.ExtraMushroom;

public class DecoratorMain {

    public static void main(String[] args) {
        BasePizza basePizza1 = new ExtraCheese( new Margherita() );
        System.out.println(basePizza1.cost());

        BasePizza basePizza2 = new ExtraMushroom( new MushroomMagic() );
        System.out.println(basePizza2.cost());

    }
}
