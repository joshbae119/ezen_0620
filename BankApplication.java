package exam0620;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
				case 1:
					CreateAccount.execute(accountArray, scanner);
					break;
				case 2:
					AccountList.execute(accountArray);
					break;
				case 3:
					Deposit.execute(accountArray, scanner);
					break;
				case 4:
					Withdraw.execute(accountArray, scanner);
					break;
				case 5:
					run = false;
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

	// Account 클래스는 그대로 유지
}