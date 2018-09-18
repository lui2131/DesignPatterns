package Behaviors.BehaviorImplementations.FlightBehaviors;

import Behaviors.BehaviorInterfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
        return;
    }
}