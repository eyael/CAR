package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        String user ="";
        System.out.println("enter your car choise");
        user=sc.nextLine();



        cars.add(user);

        System.out.println(cars);


    }
}
