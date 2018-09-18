package Behaviors.BehaviorImplementations.QuackBehaviors;

import Behaviors.BehaviorInterfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.print("<< Silence >>");
        return;
    }

}
