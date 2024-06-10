package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		int result1 = 10 + 2 + 8;
		System.out.println(result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println(result2);	// 12 + "8" = "128"
		
		String result3 = "10" + 2 + 8;
		System.out.println(result3);	// "102" + 8 = "1028", 무조건 왼쪽부터 계산
	}
}

// 문자열과 다른 문자열, 숫자가 + 연산자로 계산되면 문자열로 간주되고 합쳐진다.
