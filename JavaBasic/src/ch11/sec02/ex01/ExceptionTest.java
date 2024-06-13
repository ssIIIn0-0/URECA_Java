package ch11.sec02.ex01;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("예외 테스트");
		printLength("Java");
		String s = null;
//		printLength(s));	// nullpointException 발생
	}
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : " + result);
	}

}
