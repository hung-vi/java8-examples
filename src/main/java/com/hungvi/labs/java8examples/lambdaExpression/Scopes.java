package com.hungvi.labs.java8examples.lambdaExpression;

public class Scopes {

    final static String SALUTATION = "Hi! ";

    public void run()
    {
        GreetingService greetingService = name -> System.out.println(String.format("Hi %s", name));
        greetingService.printMessage(SALUTATION);
    }

    interface GreetingService {
        void printMessage(String message);
    }

}
