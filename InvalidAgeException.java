/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandlingParctice;

/**
 *
 * @author ASWANTH S
 */
public class InvalidAgeException extends Exception {

    InvalidAgeException(String minor_Not_Allowed) {
        super(minor_Not_Allowed);
    }

   
}
