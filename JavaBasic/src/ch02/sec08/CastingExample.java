package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 명시 형변환
		int var1 = 1000;
		byte var2 = (byte) var1;
		System.out.println(var2);	// byte범위를 넘어가서 이상한 값이 출력
		
		int var3 = 65;
		char var4 = (char)var3;
		System.out.println(var4);
		
		double var5 = 3.141592;
		int var6 = (int)var5;
		System.out.println(var6);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 10 + 20;
//		byte b4 = b1 + b2;	// byte, short 오른쪽
	}

}

// primitive type으로 형변환 개념을 익히고 있지만, 실제로는 primitive type의 형변환은 거의 사용X
// reference type의 형변환이 중요!

