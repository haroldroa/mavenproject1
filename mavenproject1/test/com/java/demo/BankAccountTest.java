/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold
 */
public class BankAccountTest {
    
    BankAccount instance;
    double savingsAmount = 2655.0;
    
    public BankAccountTest() {
    }

    @Before
    public void setUp() {
        instance = new BankAccount(savingsAmount);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of debit method, of class BankAccount.
     */
    @Test
    public void testDebitEnoughBalance() {
        System.out.println("debit enough balance");
        double windrawAmmount = 2655.0;
        double expResult = 2655.0;
        double result = instance.debit(windrawAmmount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDebitNotEnoughBalance() {
        System.out.println("debit not enough balance");
        double windrawAmmount = 3000.0;
        double expResult = 2655.0;
        double result = instance.debit(windrawAmmount);
        assertEquals(expResult, result, 0.0);
    }
    
    
}
