/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import junit.framework.TestCase;

/**
 *
 * @author Harold
 */
public class BankAccountTest extends TestCase {
    
     BankAccount instance;
    double savingsAmount = 2660.0;
    
    public BankAccountTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
         instance = new BankAccount(savingsAmount);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testDebitEnoughBalance() {
        System.out.println("debit enough balance");
        double windrawAmmount = 2655.0;
        double expResult = 2655.0;
        double result = instance.debit(windrawAmmount);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test not enough savings
     */
    public void testDebitNotEnoughBalance() {
        System.out.println("debit not enough balance");
        double windrawAmmount = 3000.0;
        double expResult = 2655.0;
        double result = instance.debit(windrawAmmount);
        assertEquals(expResult, result, 0.0);
    }
}
