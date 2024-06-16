package ch12.sec07;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 1. Math.random() : 0.0 <= ? < 1.0
		// 정수 랜덤 수를 만드는 데 귀찮은 코드를 작성
		
		// 2. java.util.Random 객체
		Random random = new Random(3);	// seed
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(45));	// 0 ~ 44 범위 안에서 랜덤값 출력
		}

	}

}
