package ch07.sec05.sub;

import ch07.sec05.Parent;

public class SubChild extends Parent{
	public void m() {
		Parent parent = new Parent();
		parent.m2();	// 상속관계여서 가능
//		parent.m3();	// 상속관계가 아니여서(protected) 불가능
	}
	public void m5() {
		m1();
		m3();
//		m4();
	}
}
