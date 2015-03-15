/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Harold
 */
public class BankAccount {
 
  private double balance;
 
  public BankAccount(double balance) {
    this.balance = balance;
  }
 
  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }
 
    balance -= amount;
    return amount;
  }
 
}
