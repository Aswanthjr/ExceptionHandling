/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionHandlingParctice;

import java.util.Scanner;

/**
 *
 * @author ASWANTH S
 */
public class ArithmeticExecption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Divide by Zero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = scanner.nextInt();
        
        try
        {
            int divide = num1/num2;
            System.out.println("The Divided Number is : " + divide);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter the Number Rather than Zero");
        }
        
        
        
        
    }
    
}
