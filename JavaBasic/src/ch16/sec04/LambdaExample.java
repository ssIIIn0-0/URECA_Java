package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		// 덧셈
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 뺄셈
		person.action((x, y) -> {
			return x - y;
		});

		// 곱셈
		person.action((x, y) -> x * y);

		// 메소드 이용
		person.action((x, y) -> sum(x, y));
	}

	public static double sum(double x, double y) {
		// 복잡한 계산이나 처리를 여기에 작성하고, main에서 호출
		return x + y;
	}
}
