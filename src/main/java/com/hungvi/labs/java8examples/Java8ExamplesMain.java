package com.hungvi.labs.java8examples;

import com.hungvi.labs.java8examples.lambdaExpression.Scopes;
import com.hungvi.labs.java8examples.lambdaExpression.SimpleCompareJ7J8;
import com.hungvi.labs.java8examples.lambdaExpression.SimpleMathOperation;
import com.hungvi.labs.java8examples.methodReference.SimpleMethodReference;

public class Java8ExamplesMain {

    public static void main(String[] args) {
        new SimpleCompareJ7J8().run();
        new SimpleMathOperation().run();
        new Scopes().run();
        new SimpleMethodReference().run();
    }
}
