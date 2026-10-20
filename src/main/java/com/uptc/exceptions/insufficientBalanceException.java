package com.uptc.exceptions;

/**
 * excepcion para validar el saldo 
 * @author karol
 * @version 25.0.3
 */

public class insufficientBalanceException extends Exception{

    /**
     * crea una excepcion cuando la cantidad a retirar es mayor al saldo de la cuenta
     * @param message muestra mensaje de error
     */
    public insufficientBalanceException(String message) {
        super(message);
    }
    
    
}
