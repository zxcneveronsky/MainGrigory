package org.example;

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



    }
}