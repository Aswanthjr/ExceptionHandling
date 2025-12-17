/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandlingParctice;

import java.util.Scanner;

/**
 *
 * @author ASWANTH S
 */
public class Custom {

    public static void user(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Minor Not Allowed");
        } else {
            System.out.println("Good to goo");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Age : ");
            int age = scanner.nextInt();
            Custom.user(age);
        } catch (InvalidAgeException e) {
            System.out.println("Own Exception Caugth : " + e.getMessage());
        }

    }
}
