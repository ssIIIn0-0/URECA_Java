package ch06.sec10.ex01;

public class CalculatorExample {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		double result1 = 10*10*calc.pi;
//		static으로 설정한 변수를 이렇게 쓰면 경고 뜸
		
		double result1 = 10*10*Calculator.pi;
		System.out.println(result1);
		System.out.println(Calculator.plus(5, 10));
		System.out.println(Calculator.minus(5, 10));
		
		int a = 10;
		int b = 20;
		System.out.println(Math.max(a, b));
		System.out.println(Math.abs(a-b));
		// Math의 선언을 보면 여기도 static으로 되어있다.
		// 즉, class.메소드(.연산자 사용)를 해서 static 메소드를 사용할 수 있다.
	}

}
// static 필드나 메소드는 객체별로 존재할 필요없이 모두에게 동일하거나,
// 단순기능을 수행하는 목적으로 사용한다.

