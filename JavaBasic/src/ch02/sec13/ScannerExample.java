package ch02.sec13;

import java.util.Scanner;
// compiler가 자동으로 해주는 작업 
// #1 java.lang package는 자동으로 import해줌 ex) sec10의 PrimitiveString에서 parse할 때
// 하지만 scanner은 안됨 string빼곤 라이브러리에 있는 클래스 사용하려면 직접! import해줘야함.
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// ctrl + shift + O <= 자동 import
		System.out.println("정수값 입력 : ");
		int input = sc.nextInt();
		System.out.println(input);
	}

}
