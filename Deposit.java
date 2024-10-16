package exam0620;

import java.util.Scanner;

public class Deposit {
    public static void execute(Scanner scanner) {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static Account findAccount(String ano) {
        for (Account account : BankService.getAccounts()) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
