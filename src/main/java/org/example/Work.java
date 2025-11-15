package org.example;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(2);
        a.add(5);


        a.stream();
        System.out.println(a.stream().sorted((x,b)->b-x).toList());



    }
}
