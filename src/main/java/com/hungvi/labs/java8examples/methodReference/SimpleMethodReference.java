package com.hungvi.labs.java8examples.methodReference;

import java.util.ArrayList;
import java.util.List;

public class SimpleMethodReference {

    List names = new ArrayList();
    {
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");
    }

    public void run() {
        staticMethod();
        instanceMethod();
        constructorUsingNewOperator();
    }

    void staticMethod() {


        names.forEach(System.out::println);
    }

    public void instanceMethod() {
        StringProcessor processor = new StringProcessor();
        names.forEach(processor::println);
    }

    public void constructorUsingNewOperator() {
        StringProcessor processor = new StringProcessor();

        names.forEach(MyStringUtils::new);
    }

    class StringProcessor {
        void println(Object message) {
            System.out.println(message);
        }
    }

    class MyStringUtils {
        private Object input;

        public MyStringUtils(Object _input) {
            this.input = _input.toString();
        }
    }

}
