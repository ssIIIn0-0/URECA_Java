package ch07.sec07;
//compiler 가 자동으로 해주는 것
//1. java.lang 자동 import
//2. class에 생성자가 없으면 기본 생성자를 추가 (기본생성자 : 파라미터가 없는 생성자)
//3. 자식 클래스에서 부모클래스의 생성자를 호출하지 않으면 자동으로 super()를 호출
//4. 클래스가 아무것도 상속받지 않으면, 자동으로 object 클래스를 상속시킨다.
//	즉 모든 클래스는 Object를 상속받고 있다. extents Object
public class PromotionExample {	// 이게 Object 클래스

	public static void main(String[] args) {
		B b = new B();
		B b2 = new C();
		B b3 = new D();
//		B b4 = new A();	// 이건 안됌 선언은 B로 됐는데, 생성은 A만 됐음
		
		C c = new D();
		
		// 모든 클래스의 최상위 클래스는 Object클래스
		Object o = new A();
	}

}
class A {}	// == class A extends Object{}
class B extends A{}
class C extends B{}
class D extends C{}
