package FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizzas;

import FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizza;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Putting Cheese Pizza in Box");
    }
    
}