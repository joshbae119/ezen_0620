package exam0620;

public class AccountList {
    public static void execute(Account[] accountArray) {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
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