package Behaviors.BehaviorImplementations.FlightBehaviors;

import Behaviors.BehaviorInterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
