package Behaviors.BehaviorImplementations.QuackBehaviors;

import Behaviors.BehaviorInterfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Squeak");
        return;
    }
}
