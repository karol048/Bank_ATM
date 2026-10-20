package com.uptc.model;

/**
 * 
 * @author Usuario
 * @version 25.0.3
 */
public class BankAccount {

    private String accountNumber;
    private String password;
    private double BalanceATM;

    /**
     * Crea la cuenta con los datos
     *
     * @param accountNumber número que identifica la cuenta
     * @param password contraseña para acceder
     * @param BalanceATM saldo de la cuenta
     */
    public BankAccount(String accountNumber, String password, double BalanceATM) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.BalanceATM = BalanceATM;
    }

    /**
     * Obtiene el número de la cuenta
     *
     * @return número de la cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Obtiene la contraseña de acceso
     *
     * @return contraseña de la cuenta
     */
    public String getPassword() {
        return password;
    }

    /**
     * Obtiene el saldo disponible en la cuenta
     *
     * @return saldo de la cuenta
     */
    public double getBalanceATM() {
        return BalanceATM;
    }

    /**
     * Actualiza la contraseña de la cuenta
     *
     * @param password nueva contraseña para la cuenta
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Actualiza el saldo de la cuenta
     *
     * @param BalanceATM nuevo saldo de la cuenta
     */
    public void setBalanceATM(double BalanceATM) {
        this.BalanceATM = BalanceATM;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", password=" + password + ", BalanceATM=" + BalanceATM + '}';
    }
    
    
}
