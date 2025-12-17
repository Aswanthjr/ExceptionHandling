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
public class NestedExecep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try 
        {
        System.out.print("Enter the Number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = scanner.nextInt();
        //Handing logics
            int divide = num1/num2;
            System.out.println("The Divided Number is : " + divide);
            
        //Nested try-catch block
            try
            {
                int arr[] = {1,2,3,4,5};
                System.out.print("Enter the index number to return : ");
                int num = scanner.nextInt();
                System.out.println("The Index Of the Array : " + arr[num]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("The index its exceed its reach");
            }
       
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter the Number Rather than Zero");
        }
    }
}
