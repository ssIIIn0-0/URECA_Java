package factory;

public class Test {

	public static void main(String[] args) {
//		이렇게 직접 객체를 만드는게 아니라,
		// 사용하는 쪽인 Test가 Car 클래스를 인지하고 클래스 타입으로 얻는다.
//		Car car = new Car();
		// Car 대신 SportCar 로 변경되는경우 코드를 변경해야 한다.
//		SportCar car = new SportCar();
		// 만들어지는 객체가 Car(), SportCar() 객체이든 Transportation 인터페이스에 있는
		// 메소드만 사용
//		Transportation car = new Car();
//		Transportation car = new SportCar();
		
		
//		TransportationFactory를 이용해서 객체를 만든다
		// Car 클래스를 몰라도 문자열로 필요한 객체를 인터페이스 타입으로 얻을 수 있다.
		Transportation t = TransportationFactory.getTransportation("Car");
		t.move();
		
		Transportation t2 = TransportationFactory.getTransportation("Air");
		t2.move();
		
	}

}
