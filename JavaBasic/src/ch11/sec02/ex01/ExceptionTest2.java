package ch11.sec02.ex01;
// RuntimeException
public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("예외 테스트");
		try {
			printLength("Java");
			String s = null;
			printLength(s);	// nullpointException 발생
		}catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		}finally {
			System.out.println("finally block");
		}
	}
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : " + result);
	}

}

// 예외는 처리되지 않으면 호출한 메소드로 넘어간다.
// 1. RuntimeException : try&catch가 없어도 자동으로 호출한 메소드로 넘어감 (있으면 try&catch를 따름)
// 2. CheckedException : 수동으로 호출한 메소드로 넘겨줘야함