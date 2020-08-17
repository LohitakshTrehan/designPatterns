package FactoryPattern.SimpleFactory.SimpleFactoryExample;

import FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizzas.CheesePizza;
import FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizzas.ClamPizza;
import FactoryPattern.SimpleFactory.SimpleFactoryExample.Pizzas.PepperoniPizza;

/**
 * Factory should be the only part of our application
 * that refers to concrete Pizza classes
 */
public class SimplePizzaFactory {
    
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }

}