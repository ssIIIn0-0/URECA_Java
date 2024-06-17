package ch12.sec04;

public class NanoTimeTest {

	public static void main(String[] args) {
		// 수행시간 비교 테스트 시작
		long time1 = System.nanoTime();

		// 수행코드
		int sum = 0;
		for (int i = 0; i < 100_0000; i++) {
			sum += i;
		}
		// 수행시간 비교 테스트 끝
		long time2 = System.nanoTime();
		
		System.out.println("sum : " + sum);
		System.out.println("nano time 기준 소요시간 : " + (time2 - time1));
	}

}
// nano time 기준 소요시간 : 1649599
