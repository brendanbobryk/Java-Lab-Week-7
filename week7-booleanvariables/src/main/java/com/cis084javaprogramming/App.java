package com.cis084javaprogramming;

import java.util.Scanner;

/**
 * Name: Brendan Bobryk
 * Student ID #: 1036738
 * Class: CIS 084 Java Programming
 * Date: 10/10/23
 * Program: Boolean Variables
 */

public class App {
    public static void main(String[] args) {
        boolean teacher = false, isOver65 = false, hasMedical = false, eligible = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a teacher? (Y/N): ");
        String answer = input.nextLine();
        if (answer.toLowerCase() == "y") {
            teacher = true;
            System.out.println("Are you over 65 years old? (Y/N): ");
            answer = input.nextLine();
            if (answer.toLowerCase() == "y") {
                isOver65 = true;
            }
            System.out.println("Do you have a medical condition? (Y/N): ");
            answer = input.nextLine();
            if (answer.toLowerCase() == "y") {
                hasMedical = true;
            }
        } else {
            System.out.println("You are not eligable for a vaccination.");
            input.close();
            return;
        }

        if (isOver65 || hasMedical)
            eligible = true;

        input.close();

        System.out.println("Is a teacher: " + teacher);
        System.out.println("Is over 65 years old: " + isOver65);
        System.out.println("Has a medical condition: " + hasMedical);
        System.out.println("Can be given a vaccination: " + eligible);
    }
}
