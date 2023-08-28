package Exercises.AccountClassDiagram;

//Program:
// 1. Create the following Account object:
// testAccount : Account
// id = 1122
// balance = 20,000
// annualInterestRate = 4.5
// 2. Withdraw 2500 from the account.
// 3. Deposit 3000 to the account.
// 4. Print the account's information.


public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000, 4.5);
        if (testAccount.withdraw(50000)) {
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Withdraw not successful");
        }

        testAccount.deposit(3000);
        System.out.println(testAccount.getId() + " " +
                testAccount.getBalance() + " " +
                testAccount.getAnnualInterestRate() + " " +
                testAccount.getDateCreated()
        );

    }
}
