package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.wheels=4;
        System.out.println(myCar.wheels);
        myCar.nameCar="Toyota";
        System.out.println(myCar.nameCar);
        myCar.goodook();
        boolean C = true;
        myCar.startEngine(C);


        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Adolf");
        System.out.println(students.get(1));
        System.out.println(students);
        students.remove("John");
        System.out.println(students);
        Map<Integer, String> studentsId = new HashMap<>();
        studentsId.put(1,"John");
        studentsId.put(2,"Adolf");
        System.out.println(studentsId);
        System.out.println(studentsId.get(1));









    }
}