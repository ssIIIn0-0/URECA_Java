package ch05.sec04;

public class NullExample {
	
	public static void main(String[] args) {
		String str = null;
		// NullPointerException <- RunTimeException (컴파일 타임에는 check 하지 않는다.)
		System.out.println(str);
		
		String str2 = new String("Hello");
		System.out.println(str2.length());
		
		
	}
}
