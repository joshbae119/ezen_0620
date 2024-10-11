package exam0620;

import java.util.Scanner;

public class Deposit {
    public static void execute(Account[] accountArray, Scanner scanner) {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano, accountArray);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static Account findAccount(String ano, Account[] accountArray) {
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        return null;
    }
}