package main.java.patterns.DecoratorPattern.Toppings;

import main.java.patterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingAbstract{

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
