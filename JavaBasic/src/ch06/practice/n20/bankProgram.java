package ch06.practice.n20;

import java.util.Scanner;

public class bankProgram {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----1,2,3,4----");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
	}

	private static void accountList() {
	}

	private static void deposit() {
	}

	private static void withdraw() {
	}
}
