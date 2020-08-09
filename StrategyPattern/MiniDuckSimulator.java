package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}