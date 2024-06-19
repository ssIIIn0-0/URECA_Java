package ch16.sec04;

public class LambdaExample2 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.action((name,sound) -> {
			System.out.println(name + sound);
		});

	}
}
