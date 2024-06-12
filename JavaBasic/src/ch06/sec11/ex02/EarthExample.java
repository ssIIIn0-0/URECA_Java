package ch06.sec11.ex02;

public class EarthExample {

	// 정수의 최대값, 최소값을 구할 때, max= 0; 이런식으로 초기화X
	// static final을 사용해서 변수 구현(독특한 폰트로 표현되서 눈에 확 들어옴)
	static final int MAX = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		System.out.println("지구의 반지름 " + Earth.EARTH_RADIUS);
		
	}

}
