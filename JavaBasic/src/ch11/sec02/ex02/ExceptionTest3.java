package ch11.sec02.ex02;

import java.io.IOException;

// CheckedException
//try catch 같이 예외처리를 해줘야함
		// CheckedException 대응 2가지
public class ExceptionTest3 {
	// 1. throws 해주기
//	public static void main(String[] args) throws ClassNotFoundException {	
//		Class.forName("java.lang.String");
//	}

	public static void main(String[] args) {
		// 2. try-catch-finally 하기
		try{
			Class.forName("java.lang.String2222");
		}catch(ClassNotFoundException e) {
			System.out.println("class를 찾을 수 없습니다.");
		}finally { // finally 는 생략가능
			System.out.println("finally");
		}
		try {
			myMethod();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void myMethod() throws IOException{
		// IO 작업을 하다가 IO 예외가 발생할 수 있다.
	}
	
}

// 예외는 처리되지 않으면 호출한 메소드로 넘어간다.
// 1. RuntimeException : try&catch가 없어도 자동으로 호출한 메소드로 넘어감 (있으면 try&catch를 따름)
// 2. CheckedException : 수동으로 호출한 메소드로 넘겨줘야함