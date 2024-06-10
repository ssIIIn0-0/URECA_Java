package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 소수점을 포함한 실수는 기본 타입이 double
//		float var1 = 0.1234;	// 간단한 실수 리터럴도 double로 인식하고 float가 담을 수 없다.
		float var1 = 0.123456789123456789f;		// float를 사용하고 싶으면 실수 마지막에 f, F를 붙여야한다.
		double var2 = 0.123456789123456789f;	// 이건 오류x
		double var3 = 0.123456789123456789;	// 이건 오류x
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}

}

// int long float double의 범위를 벗어나는 더 큰 정수 계산 및 표현, 소수점 계산 표현 못함?
// ㄴㄴ 할 수 있음
// BigInteger, DigDecimal 클래스를 사용할 수 있지만, 느려진다. (그런건 C언어 써야함 갓C언어)



