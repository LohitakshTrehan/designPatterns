package FactoryPattern.SimpleFactory.SimpleFactoryExample;

public class OrderPizzaTest {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory); // We can plug and play any factory we like

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("clam");

    }
}