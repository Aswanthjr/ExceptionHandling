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
public class NumberFormate {
    public static void main(String[] args) {
       
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Number : ");
            String name = scanner.nextLine();
            
            try
            {
            int num = Integer.parseInt(name);
            System.out.println("Converted Number : " + num);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Enter Only Numbers..");
            }
        }
       
}
