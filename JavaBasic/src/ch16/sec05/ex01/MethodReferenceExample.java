package ch16.sec05.ex01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x, y) -> Computer.staticMethod(x, y));
		person.action(Computer :: staticMethod);	// staticMethod 호출 시 클래스 이름 :: 메소드
		
		Computer computer = new Computer();
		person.action((x, y) -> computer.instanceMethod(x, y));
		person.action(computer :: instanceMethod);	// instanceMethod 호출 시 객체 이름 :: 메소드

	}

}
