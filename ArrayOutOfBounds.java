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
public class ArrayOutOfBounds {
    //Array IndexOutOfBounds
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
}
