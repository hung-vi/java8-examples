package com.hungvi.labs.java8examples.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleCompareJ7J8 {

    public void run() {
        List<String> j7Names = new ArrayList<>();
        j7Names.add("An");
        j7Names.add("Binh");
        j7Names.add("Chung");
        j7Names.add("Duc");

        List<String> j8Names = new ArrayList<>();
        System.out.println(j8Names.addAll(j7Names));
        sortUsingJ7(j7Names);
        sortUsingJ8(j8Names);
        System.out.println(j8Names);
    }

    private void sortUsingJ7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJ8(List<String> names) {
        Collections.sort(names, (s1, s2) -> {
            return s1.compareTo(s2);
        });
    }
}
