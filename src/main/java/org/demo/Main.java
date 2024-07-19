package org.demo;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        String greetingMsg = greeting.greetSomeones("Joseph");
        System.out.println(greetingMsg);
    }
}