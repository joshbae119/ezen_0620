package exam0620;

import java.util.Scanner;

public class CreateAccount {
    public static void execute() {
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = BankService.getScanner().next();

        System.out.print("계좌주: ");
        String owner = BankService.getScanner().next();

        System.out.print("초기입금액: ");
        int balance = BankService.getScanner().nextInt();

        Account newAccount = new Account(ano, owner, balance);
        Account[] accounts = BankService.getAccounts();
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }
}