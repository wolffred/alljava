package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

//    public static void example() throws Exception{
//        System.out.println("Throws Checked Exception");
//    }
//
//    public static void example2() throws RuntimeException{
//        System.out.println("Throws Checked Exception");
//    }
//
//    public static void doSomething ()throws Exception{
//        example();
//    }
//
//    public static void main(String[] args) {
//
//        example2();
//
//        try {
//            example();
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }finally {
//            System.out.println();
//        }
//
//    }





    public static void main(String [] args){
//        int age;
//        System.out.print("Enter Age: ");
//
//        Scanner input = new Scanner(System.in);
//
//        try {
//            age = input.nextInt();
//        }catch (InputMismatchException er){
//            System.out.println(er);
//            System.out.println("Wrong data type");
//        }finally {
//            System.out.println("You entered wrong data type");
//        }


//        FileReader fr = null;
//        BufferedReader bfr = null;
//
//        try{
//            fr = new FileReader( args[0]);
//            bfr = new BufferedReader(fr);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }catch (IOException ex){
//            throw new RuntimeException(ex);
//        }

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Boy");
        students.put(2, "Girl");
        students.put(3, "Man");
        students.put(4, "Woman");

        System.out.println(students.get(1));

        for(var entry: students.entrySet()){
            System.out.println(entry);
        }

        for(var entry: students.keySet()){
            System.out.println(entry);
        }

        for(var entry: students.values()){
            System.out.println(entry);
        }


        Map<Integer, Map<Integer, String>> classes = new HashMap<>();

        Map<Integer, String> class1 = new HashMap<>();
        Map<Integer, String> class2 = new HashMap<>();
        Map<Integer, String> class3 = new HashMap<>();

        class1.put(1, "Boy");
        class1.put(2, "Girl");
        class1.put(3, "Man");
        class1.put(4, "Woman");

        class2.put(1, "Boy");
        class2.put(2, "Girl");
        class2.put(3, "Man");
        class2.put(4, "Woman");

        class3.put(1, "Boy");
        class3.put(2, "Girl");
        class3.put(3, "Man");
        class3.put(4, "Woman");

        classes.put(1, class1);
        classes.put(2, class2);
        classes.put(3, class3);

        System.out.println(classes.get(2));
        System.out.println(classes.get(2).keySet());







    }

}