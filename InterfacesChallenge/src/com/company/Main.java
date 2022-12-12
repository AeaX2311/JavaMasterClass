package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Player ex = new Player("Alan",100,"Sword","Infinity");
        System.out.println(ex);

        ex.setAbility("Protection");
        saveObject(ex);
        ex.setLevel(10);
        System.out.println(ex);
     //   loadObject(ex);
        System.out.println(ex);

        ISaveable wolf=new Monster("Wolf",50,"Arrows");
        System.out.println(wolf);
        System.out.println(((Monster)wolf).getName());
        saveObject(wolf);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        boolean quit = false;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(""+stringInput);
                    break;
            }
        }
        return values;
    }
    public static void loadObject(ISaveable it){
        it.addObject(readValues());
    }
    public static void saveObject(ISaveable lt){
        for(String x:lt.getList()){
            System.out.println("Se guardo: "+x);
        }
    }
}
