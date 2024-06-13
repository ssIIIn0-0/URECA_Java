package ch07.sec10.ex01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("시은");	// 추상클래스인 Phone 클래스는 객체를 만들 수 없다
		SmartPhone sPhone = new SmartPhone("진우");
		sPhone.turnOn();
		sPhone.internetSearch();

	}

}
