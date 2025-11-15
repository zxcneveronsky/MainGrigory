package org.example;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Person person = new Person(20,"John");
        boolean a = ageChech(x->(x.age()>=18)&(x.age()<35),person);
        System.out.println(a);


    }
    public static boolean ageChech(Predicate<Person> predicate,Person person){
        return predicate.test(person);


    }
}
