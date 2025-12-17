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
public class FileNotFound {
    public static void main(String[] args) {
       try
       {
           FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\Test.txt");
           System.out.println("File is Imported");
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File is not Imported");
       }
    }
}
