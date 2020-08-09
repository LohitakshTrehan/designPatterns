package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyNoWay;
import StrategyPattern.QuackBehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}