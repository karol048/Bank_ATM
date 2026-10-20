package com.uptc.view;

import com.uptc.exceptions.IncorrectKeyException;
import com.uptc.exceptions.InvalidAmountException;
import com.uptc.exceptions.insufficientBalanceException;
import com.uptc.logic.ATM;
import com.uptc.model.BankAccount;

/**
 * 
 * @author Usuario
 * @version 25.0.3
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        BankAccount bank = new BankAccount("001", "1234", 500);
        ATM atm = new ATM(bank);
        
        try {
           atm.WithDraw(100, "0000");
        } catch (insufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.WithDraw(1000, "1234");
        } catch (insufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.WithDraw(-50, "1234");
        } catch (insufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.WithDraw(200, "1234");
        } catch (insufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        System.out.println(atm.getAccount());
    }
    
}
