/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.exceptions;

/**
 *excepcion para validar la contraseña
 * @author karol
 * @version 25.0.3
 * 
 */
public class IncorrectKeyException extends Exception {

    /**
     * crea una excepcion cuando la congtraseña esta incorrecta
     * 
     * @param message muestra mensaje de error
     */
    public IncorrectKeyException(String message) {
        super(message);
    }
    
    
}
