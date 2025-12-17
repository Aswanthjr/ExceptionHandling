/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandlingParctice;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ASWANTH S
 */
public class FinnalyBlock {
    public static void main(String[] args) throws FileNotFoundException {
        try
        {
        FileReader fr = new FileReader("test.txt");
        System.out.println("The File : " + fr);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found ");
        }
        finally
        {
            System.out.println("Closing resources");
        }
    }
}
