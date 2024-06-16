package ch03.sec11;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 90초과 A
		// 81 ~ 90 B
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
	}

}
