package application;

import Entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Updated account data: " );
        System.out.println(account);

        System.out.println();
        System.out.println("Amount deposit: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: " );
        System.out.println(account);

        System.out.println();
        System.out.println("Withdraw amount: ");
        double withdrawValue = sc.nextDouble();
        System.out.println("Updated account data: " );
        account.withdraw(withdrawValue);
        System.out.println(account);


        sc.close();
    }
}
