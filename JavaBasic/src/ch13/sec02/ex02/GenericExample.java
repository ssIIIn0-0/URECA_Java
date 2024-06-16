package ch13.sec02.ex02;

public class GenericExample {

	public static void main(String[] args) {
		
		// 클래스 제네릭
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		
		// 인터페이스 제네릭
		Rentable<Home> homeAgency_I = new HomeAgency();
		Home home_I = homeAgency_I.rent();
		
		Rentable<Car> carAgency_I = new CarAgency();
		Car car_I = carAgency_I.rent();
	}

}
