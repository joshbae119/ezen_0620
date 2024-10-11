package exam0620;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accounts = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
				case 1: createAccount(); break;
				case 2: showAccountList(); break;
				case 3: deposit(); break;
				case 4: withdraw(); break;
				case 5: isRunning = false; break;
			}
		}
		System.out.println("프로그램종료");
	}

		private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("예금주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금: ");
		int balance = Integer.parseInt(scanner.nextLine());
		Account newAccount = new Account(ano, owner, balance);
			for(int i=0; i<accounts.length; i++) {
				if(accounts[i] == null) {
					accounts[i] = newAccount;
					System.out.println("결과: 계좌 생성 성공.");
					break;
				}
			}
		}
		//계좌목록보기
		private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
			for(int i=0; i<accounts.length; i++) {
				Account account = accounts[i];
				if(account != null) {
					System.out.print(account.getAno());
					System.out.print(" ");
					System.out.print(account.getName());
					System.out.print(" ");
					System.out.print(account.getBalance());
					System.out.println();
				}
			}
		}
		//예금하기
		private static void deposit() {
			System.out.println("--------------");
			System.out.println("예금");
			System.out.println("--------------");
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			System.out.print("예금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("결과: 해당 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 예금 성공!");
		}
		//출금하기
		private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
			if(account == null) {
				System.out.println("결과: 계좌가 존재하지 않습니다. ");
				return;
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금 성공!");
		}
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
		Account account = null;
			for(int i=0; i<accounts.length; i++) {
				if(accounts[i] != null) {
					String dbAno = accounts[i].getAno();
					if(dbAno.equals(ano)) {
						account = accounts[i];
						break;
					}
				}
			}
			return account;
		}
}