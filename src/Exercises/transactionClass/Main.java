package Exercises.transactionClass;

import Exercises.AccountClassDiagram.Account;
import Exercises.clientClass.Client;

import java.util.ArrayList;

// Program
// 1. Create an ArrayList of Accounts
// 2. Display the number of deposits and withdrawals of each account
public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100, "James", "8477");

        accounts.add(new Account(1, 1000, 1.5, client));
        accounts.add(new Account(2, 2000, 2.5, client));

        accounts.get(0).withdraw(500);
        accounts.get(1).deposit(50000);

        System.out.println(accounts.get(1));

//        for (Account account : accounts) {
//            System.out.println("Account " + account.getId() + ":");
//            System.out.println("W:" + account.countTransactions('W'));
//            System.out.println("D:" + account.countTransactions('D'));
//        }
    }
}
