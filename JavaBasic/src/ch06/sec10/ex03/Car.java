package ch06.sec10.ex03;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + "로 달린다.");
	}
	
	static void simulate() {
		System.out.println("simulate");
//		this.speed = 0; : static변수는 this를 사용할 수 없다.
//		speed = 0; : 멤버 변수에 접근 x
//		run(); : nonstatic field에 접근할수도 없다.
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		Car.simulate();
	}

}
