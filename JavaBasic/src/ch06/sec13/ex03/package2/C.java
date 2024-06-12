package ch06.sec13.ex03.package2;

import ch06.sec13.ex03.package1.A;

public class C {
	public void method() {
		A a = new A();
		a.field1 = 2;	
//		a.field2 = 3;	// default : 다른 패키지
//		a.field3 = 4;	// private
		
		a.method1();
//		a.method2();	// default : 다른 패키지
//		a.method3();	// private
	}
}
