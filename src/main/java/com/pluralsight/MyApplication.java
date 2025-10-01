package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getName();
        getAge();
        voteAge(24);
        nameage("Prince", 24);
        System.out.println("What's your name?");
        String username = scanner.nextLine();
        usernameAlice(username);
        System.out.println("What's your name?");
        String username1 = scanner.nextLine();
        System.out.println("What's your age?");
        int age21 = scanner.nextInt();
        scanner.nextLine();
        usernameBobAnd21(username1, age21);
        squareRoot();
        integers(5, 7);
        equalsLara();
        whichIsLarger(90, 60);
        int number = randomNr();
        System.out.println("Random number: " + number);
        whichIsSmaller(3,6);
    }

    public static String getName() {
        String name;
        System.out.println("What's your name?");
        name = scanner.nextLine();
        return name;
    }

    public static int getAge() {
        int age;
        System.out.println("What's your age?");
        age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static int voteAge(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("Too young to vote...");
        }
        return age;
    }

    public static void nameage(String name, int age) {
        System.out.println(name + "! " + "You are" + " " + age);
    }

    public static String usernameAlice(String username) {
        if (username.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome, Alice");
        } else {
            System.out.println("Hello!");
        }
        return username;
    }
    public static void usernameBobAnd21(String username1, int age21){
        if (username1.equalsIgnoreCase("Bob") && age21 >= 21){
            System.out.println("You can drink");
        }else{
            System.out.println("Not old enough to drink");
        }
    }
    public static int squareRoot(){
        int number;
        System.out.println("Give me a number");
        number = scanner.nextInt();
        scanner.nextLine();
        double result = Math.sqrt(number);
        System.out.println(result);
        return number;
    }
    public static void printWelcomeMessage(String username){
switch (username){
    case "Alice":
        System.out.println("Welcome, Alice");
        break;
    case "Bob":
        System.out.println("Do you want to get a drink?");
        break;
    default:
        System.out.println("Hello");
        break;
}
    }
    public static boolean integers(int one, int two) {
        if (one > two) {
            System.out.println(one + " " + ">" + " " + two);
            return true;
        } else {
            System.out.println(two + " " + ">" + " " + one);
            return false;
        }
    }
    public static String equalsLara() {
        System.out.println("What's your name?");
        String name3 = scanner.nextLine();
        String message = name3.equalsIgnoreCase("Lara") ? "You are not welcomed, Lara" : "Welcome!";
        System.out.println(message);
        return name3;
    }
    public static int whichIsLarger(int one1, int two2){
    int whichIsLarger = Math.max(one1, two2);
        System.out.println(Math.max(one1, two2));
        return whichIsLarger;
    }
    public static int randomNr(){
     int randomNr = (int) (Math.random()* 10);
     return randomNr;
        }

    public static int whichIsSmaller(int one11, int two22){
    int whichIsSmaller = Math.min(one11, two22);
    System.out.println(Math.min(one11, two22));
    return whichIsSmaller;
}
}
