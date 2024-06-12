package ch07.sec08.ex02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle());	// 객체를 전달
		driver.drive(new Bus());	// 객체를 전달
		driver.drive(new Taxi());	// 객체를 전달
		// 3개다 모두 다른 객체이지만, 메소드도 3개를 만들 필요는 없다
	}

}
