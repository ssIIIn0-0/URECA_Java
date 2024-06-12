package ch07.sec08.ex02;

public class Driver {
	// Vehicle 객체, Bus 객체, Taxi 객체 가 넘어올 수 있다
	public void drive(Vehicle vehicle) {
		System.out.println("drive Vehicle");
		vehicle.run();
	}
	
	// specific한 객체를 받으면 그 객체가 파라미터인 생성자를 실행하고,
	// 아니면 일반적인 생성자가 실행된다.
	public void drive (Bus vehicle) {
		System.out.println("drive Bus");
		vehicle.run();
	}
}
