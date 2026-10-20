/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uptc.bankAtm.test;

import com.uptc.exceptions.IncorrectKeyException;
import com.uptc.exceptions.InvalidAmountException;
import com.uptc.exceptions.insufficientBalanceException;
import com.uptc.logic.ATM;
import com.uptc.model.BankAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Usuario
 * @version 25.0.3
 */
public class BankAccounTest {

    BankAccount account;
    ATM atm;

    public BankAccounTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        account = new BankAccount("001", "1234", 500);
        atm = new ATM(account);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void validateUserAccount() {
        assertEquals("001", account.getAccountNumber());
        assertEquals(500.01, account.getBalanceATM(), 0.1);
    }

    @Test
    public void depositBankAccount() {
        atm.deposit(500);
        assertEquals(1000.0, account.getBalanceATM());
    }

    @ParameterizedTest
    @ValueSource(doubles = {1002, 1200, 1000})
    void withdrawWithWrongKeyThrowsIncorrectKeyException(double amount) {
        assertThrows(IncorrectKeyException.class,
                () -> atm.WithDraw(amount, "0000"));
    }

    @Test
    void WithdrawNegativeAmountThrowsIvalidAmountException(double amount, double expecBalance) {
        assertThrows(InvalidAmountException.class,
                () -> atm.WithDraw(200, "12345678"));
    }

    @Test
    @ValueSource(doubles = {100000, 30000000, 1400, 1})
    void withdrawMoreThanBalanceThrowsvalidateinsufficientBalanceExceptions(double amount) {
        insufficientBalanceException e = assertThrows(insufficientBalanceException.class,
                () -> atm.WithDraw(amount, "1234"));
        assertNotNull(e.getMessage());
    }
}
