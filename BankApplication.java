package exam0620;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = BankService.getScanner().nextInt();

			if (selectNo == 1) {
				CreateAccount.execute();
			} else if (selectNo == 2) {
				AccountList.execute();
			} else if (selectNo == 3) {
				Deposit.execute();
			} else if (selectNo == 4) {
				Withdraw.execute();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		BankService.closeScanner();
	}

	// Account 클래스는 그대로 유지
}