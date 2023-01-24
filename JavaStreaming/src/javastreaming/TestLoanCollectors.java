/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreaming;

/**
 *
 * @author EddyJ
 */
// Name: ??? Your Name ???
import java.util.*;
import java.util.stream.Collectors;

public class TestLoanCollectors {
  public static void main(String[] args) {
    Loan[] loans = {new Loan(4.5, 3, 2000.23), new Loan(4.15, 1, 2100.23),
      new Loan(4.35, 3, 2003.23), new Loan(4.5, 3, 4000.23),
      new Loan(4.15, 3, 4000.23), new Loan(4.05, 3, 4000.23),
      new Loan(4.5, 3, 1000.23), new Loan(4.5, 3, 1200.83),
      new Loan(4.5, 9, 2000.23), new Loan(4.5, 8, 2000.23)};

   /* 1. Fill in the code in the program to display the largest three Loan objects in non-increasing order. 
Sorting criteria: Given two Loan objects loan1 and loan2, loan1 > loan2 if loan1.getAmount() > loan2.getAmount() or (loan1.getAnnualInterestRate() > loan2.getAnnualInterestRate() and  loan1.getAmount() == loan2.getAmount()). 
  */
   
   
    

    /* 2. Write code here to group the loan by numberOfYears and display the group in increasing order of the numberOfYears. Display "loan/loans", "have/has", "year/years" appropriately, as shown in the sample run. */




  }
}

class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /** Construct a loan with specified annual interest rate,
      number of years, and loan amount
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
  
  @Override
  public String toString() {
    return "Loan(amount: " + loanAmount + ", annualInterestRate: " + annualInterestRate 
      + ", numberOfYears: " + numberOfYears + ")";
  }
}
