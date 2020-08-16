package DecoratorPattern.BeverageExample.Beverages;

import DecoratorPattern.BeverageExample.Beverage;

public class Espresso extends Beverage {

    private String description;

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}