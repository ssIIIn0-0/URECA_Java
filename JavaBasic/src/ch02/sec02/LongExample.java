package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
			long var1 = 10;		// int값으로 인식
			long var2 = 20L;	// ~~L : Long형의 값이다.
			long var3 = 100_000_000_000L;	// ~~L 안붙이면 int value로 인식해서 오류남
			long var4 = 100_000_000_000l;	// L은 대소문자 상관없이 붙일 수 있다.

	}

}
