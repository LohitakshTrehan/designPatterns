package FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizzas;

import FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizza;

public class ClamPizza implements Pizza {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Putting Clam Pizza in Box");
    }

}