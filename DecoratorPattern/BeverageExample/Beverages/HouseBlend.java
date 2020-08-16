package DecoratorPattern.BeverageExample.Beverages;

import DecoratorPattern.BeverageExample.Beverage;

public class HouseBlend extends Beverage {

    private String description;

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}