package org.demo;

public class GreetingImpl implements Greeting {
    @Override
    public String greetSomeones(String name) {
        return "Hello " + name + "!";
    }
}
