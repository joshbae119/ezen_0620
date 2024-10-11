package exam0620;

public class Withdraw {
    public static void execute() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = BankService.getScanner().next();

        System.out.print("출금액: ");
        int money = BankService.getScanner().nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        if (account.getBalance() < money) {
            System.out.println("결과: 잔액이 부족합니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
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