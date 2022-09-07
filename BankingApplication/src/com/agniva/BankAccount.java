package com.agniva;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String coustomerName;
    String coustomerId;

    public BankAccount(String coustomerName, String coustomerId) {
        this.coustomerName = coustomerName;
        this.coustomerId = coustomerId;
    }

    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("No Transaction Found!!");
        }
    }

    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + coustomerName);
        System.out.println("Your Id: " + coustomerId);
        System.out.println("\n");
        System.out.println("A : Check Your Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit");

        do{
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Enter Your Choice");
            System.out.println("-----------------------------------------------------------------------------");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'A' :
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B' :
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit : ");
                    System.out.println("-----------------------------------------------------------------------------");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    System.out.println("\n");
                    break;

                case 'C' :
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw : ");
                    System.out.println("-----------------------------------------------------------------------------");

                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("-----------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E' :
                    System.out.println("-----------------------------------------------------------------------------");
                    break;

                default:
                    System.out.println("Invalid Option! Please Choose the Correct Option");
                    break;
            }
        } while(option != 'E');
        System.out.println("Thank You for Using Our Service!! Good Day :) ");

    }
}
