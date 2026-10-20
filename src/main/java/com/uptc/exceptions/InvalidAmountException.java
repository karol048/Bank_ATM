/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.exceptions;

/**
 *excepcion cuando el saldo es menor o igual a 0
 * @author karol
 * @version 25.0.3
 * 
 */
public class InvalidAmountException extends RuntimeException{

    /**
     * crea una excepcion cuando es saldo no es valido
     * @param message mensaje de error
     * 
     */
    public InvalidAmountException(String message) {
        super(message);
    }
    
}
