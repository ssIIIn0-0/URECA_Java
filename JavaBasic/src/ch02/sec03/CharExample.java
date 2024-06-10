package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;	// 유니코드
		
//		byte b1 = 65;
//		char c3 = b1;
		
		char c3 = '가';
		char c나 = '나';	// 변수명에 한글이 가능하다..!
		char c5 = 44033;	// 우니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c나);
		System.out.println(c5);
		
	}

}

// 기본타입 (Primitive Type) <= 화학의 원자 = 처음부터 jvm이 고정된 길이의 메모리 공간을 확보
// byte, short, char, int, long <- 정수형
// float, double <- 실수형(소수점 표현)
// 지바의 모든 데이터는 기본타입 + 배열로 표현

// 참조타입 (Reference Type) <= 화학의 원자 + 분자 = 처음부터 jvm이 고정된 길이의 메모리 공간을 확보 X
// String