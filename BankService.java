package exam0620;

import java.util.Scanner;

public class BankService {
    private static final int MAX_ACCOUNTS = 100;
    private static Account[] accounts = new Account[MAX_ACCOUNTS];
    private static Scanner scanner = new Scanner(System.in);

    public static Account[] getAccounts() {
        return accounts;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void closeScanner() {
        scanner.close();
    }
}