package exam0620;

public class AccountList {
    public static void execute() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");

        Account[] accounts = BankService.getAccounts();
        for (Account account : accounts) {
            if (account != null) {
                System.out.print(account.getAno());
                System.out.print("     ");
                System.out.print(account.getOwner());
                System.out.print("     ");
                System.out.print(account.getBalance());
                System.out.println();
            }
        }
    }
}