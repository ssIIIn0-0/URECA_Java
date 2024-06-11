package ch04.sec04;

public class ForExample {

	public static void main(String[] args) {
		// 반복문 : 횟수, 조건
		
		// 10번 반복
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 2개 변수
		for (int i = 0, j = 2; i < 10 && j < 10; i++, j--) {
			System.out.println(i);
		}
		// nested : 이중루프
		// 2차원 배열 - 그리드
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d %d  ", i, j);
			}
			System.out.println();	// 개행
		}
		
	}

}
