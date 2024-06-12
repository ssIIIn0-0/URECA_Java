package ch07.sec08.ex00;
// 재정의된 타입
public class Test {
	public static void main(String[] args) {
//		A a = new A();
//		a.m();	// A a()
		
//		// type이 A여도 객체는 B를 만들어서 B가 호출됨
//		A b = new B();
//		b.m();	// B m(), A와 B에 둘다 있으면 B 출력
//		b.m2(); // A m2(), A에만 있고 B에 없으면 A출력
////		b.m3();	// error, A에 없고 B에만 있으면 오류
////		즉, 타입에 해당하는 class에는 반드시 있어야한다.
		
//		B x = new C();
//		x.m(10);
		
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		
//		// 객체의 계층에 따라 달라짐
//		System.out.println(a instanceof A);	// T
//		System.out.println(a instanceof B);	// F
//		System.out.println(a instanceof C);	// F
//		System.out.println(a instanceof D);	// F
		
//		A x = getInstance();
//		System.out.println(x instanceof A);	// T
//		System.out.println(x instanceof B);	// T
//		System.out.println(x instanceof C);	// T
//		System.out.println(x instanceof D);	// T
		
		// 객체가 어디에 상속되어있는지, 어떤 객체가 자식객체인지
		A x = getInstance();
		// A 객체이면,, B객체이면..
		if (x instanceof D d) {
			System.out.println("D 객체야");
//			d.d();
		}
		else if (x instanceof C) System.out.println("C 객체야");
		else if (x instanceof B) System.out.println("B 객체야");
		else if (x instanceof A) System.out.println("A 객체야");
		else if (x instanceof Object) System.out.println("Object 객체야");
	}
	
	public static A getInstance() {
		return new C();
	}
}



class A{
	public void m() {System.out.println("A m()");}
	
	public void m(int n) {System.out.println("A m(int n)");}
}

class B extends A{
	public void m() {System.out.println("B m()");}
}

class C extends B{
	public void m(int n) {System.out.println("C m(int n)");}
}

class D extends C{
	public void m() {System.out.println("D m()");}
}
