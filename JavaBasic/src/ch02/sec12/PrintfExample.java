package ch02.sec12;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		int value2 = 2024;
		String str = "Hello";
		double pi = 3.141592;
		System.out.printf("상품의 가격은 %-10d입니다. %d에 만들어졌습니다. %s 문자열이예요.", value, value2, str);
		System.out.println();
		System.out.printf("현재 파이는 %10.2f", pi);
		// %10d : 10칸을 주고 그 안에서 숫자를 입력
		// &-10d : 숫자를 앞쪽부터 채움(공백이 뒤에 있음)
	}
}
