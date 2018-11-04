package com.hungvi.labs.java8examples.lambdaExpression;

public class SimpleMathOperation {

    public void run() {
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;
        MathOperation division = (int a, int b) -> a / b;
        int a = 10, b = 5;
        System.out.println(String.format("%d + %d = %d", a, b, operate(a, b, addition)));
        System.out.println(String.format("%d - %d = %d", a, b, operate(a, b, subtraction)));
        System.out.println(String.format("%d * %d = %d", a, b, operate(a, b, multiplication)));
        System.out.println(String.format("%d / %d = %d", a, b, operate(a, b, division)));
    }

    int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    interface MathOperation {
        int operate(int a , int b);
    }

}
