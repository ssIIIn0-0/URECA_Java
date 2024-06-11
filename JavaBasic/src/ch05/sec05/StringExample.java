package ch05.sec05;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// 문자열.equals(비교할 문자열) 문자열 자체를 비교
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// 문자열.length()
		System.out.println(str1.length());
		
		// 문자열.charAt(인덱스숫자)	문자열의 특정 인덱스의 값
		System.out.println(str2.charAt(2));	// 인덱스를 벗어나면 에러 발생
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
		// 문자열.replace("바꾸고 싶은 문자열", "바꿀 문자열")
		String str = "Hello, Java!!!";
//		str.replace("ll", "LL"); 이렇게 쓰면  str안바뀜. 이걸 받아주는 변수가 필요함
		String str_2 = str.replace("ll", "LL");
		System.out.println(str);
		System.out.println(str_2);
		
		// 문자열.indexOf('원하는 문자')
		String Str = "abcdefghijk";
		int idx = str.indexOf('c');
		System.out.println(idx);	// 2
		idx = Str.indexOf("def");
		System.out.println(idx);	// 3
		idx = Str.indexOf("dexf");	// 못찾으면 return값 -1
		System.out.println();		// -1
		
		// 문자열.contains("찾고싶은 문자열") 존재 유무
		boolean result = Str.contains("def");
		System.out.println(result);
		
	}

}
