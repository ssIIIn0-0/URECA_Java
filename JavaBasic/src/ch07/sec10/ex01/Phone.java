package ch07.sec10.ex01;

// 추상클래스는 객체를 만들 목적이 아닌
// 공통 속성등을 가지는 상위 개념의 클래스 상속을 통해서 통일성을 구현
public abstract class Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
//	void turnOn() {
//		System.out.println("전원 On");
//	}
	
	// 자식 클래스에서 반드시 구현해야 하는 메소드는 abstract method로 선언
	abstract void turnOn();	// 추상메소드
	
	// 자식 클래스에서 반드시 구현할 필요가 없는 메소드는 일반 method로 작성
	void turnOff() {
		System.out.println("전원 Off");
	}
}
