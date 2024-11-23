package org.example;

import models.Account;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("WithDrawLimit");
        double inittWithdraw = sc.nextDouble();
        Account conta = new Account(number, holder, balance, inittWithdraw);
        System.out.print("Enter amount for withdraw: ");
        double withdraw = sc.nextDouble();

        try {
            conta.deposit(withdraw);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("End of program");
        }
    }
}