package Behaviors.BehaviorImplementations.QuackBehaviors;

import Behaviors.BehaviorInterfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
        return;
    }
}
