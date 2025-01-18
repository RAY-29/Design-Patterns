package main.java.patterns.DecoratorPattern.Toppings;

import main.java.patterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraMushroom extends ToppingAbstract{

    private BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
