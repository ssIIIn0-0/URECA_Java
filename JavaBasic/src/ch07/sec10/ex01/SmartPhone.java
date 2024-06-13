package ch07.sec10.ex01;

public class SmartPhone extends Phone{
	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("internet search");
	}

	// 상속받은 Phone에 추상메소드가 있으므로 구현부를 만들어줘야 한다
	@Override
	void turnOn() {
		System.out.println("SmartPhone turnOn");
	}
}
