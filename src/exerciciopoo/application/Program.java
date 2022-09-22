package exerciciopoo.application;

import exerciciopoo.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int nunber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(nunber,holder,initialDeposit);
        }else {
            account = new Account(nunber,holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);


        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }
}
