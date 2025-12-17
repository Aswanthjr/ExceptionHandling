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
public class throe {

    public static void value(int num) throws Exception
    {
        
        if(num<0)
        {
            throw new Exception("Number cannot be negative");
        }
        else
        {
            System.out.println("Valid Number : " + num);
        }
    }
    public static void main(String[] args) throws Exception {
        try
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();
        throe.value(num);
        }
        catch(Exception e)
        {
            System.out.println("Exception Caugth : " + e.getMessage());
        }
   
      
}
}

