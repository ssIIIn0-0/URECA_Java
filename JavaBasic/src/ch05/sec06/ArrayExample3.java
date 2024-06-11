package ch05.sec06;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// 배열 + 반복문(for)
		// 사용자의 입력을 받은 문자열을 char 배열로 저장
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int length = input.length();
//		char[] chArr = new char[length];
//		
//		for (int i = 0; i < length; i++) {
//			chArr[i] = input.charAt(i);
//		}
//		
//		for (int i = 0; i < length; i++) {
//			System.out.print(chArr[i]);
//		}
		
//		char[] chArr = new char[length]; 같은 역할
		char[] chArr = input.toCharArray();
//		만약, 
//		char[] chArr = new char[length];
//		chArr = input.toCharArray();
//		이렇게 쓰면, heap부분에 미리 만든 배열이 쓰레기 값이 되므로 메모리 낭비가 된다.
		for (int i= 0; i < length; i++) {
			System.out.print(chArr[i]);
		}
	}

}
