package ch06.sec06;

public class MyCkassExample {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();	// 생성자 호출
		System.out.println(mc1.n);
		System.out.println(mc1.n2);
		System.out.println(mc1.s);
		System.out.println(mc1.s2);
		
		MyClass mc2 = new MyClass(5);	// 생성자 호출
		System.out.println(mc2.n);
		System.out.println(mc2.n2);
		
		MyClass mc3 = new MyClass(1, 2, "3", "4");	// 생성자 호출
		System.out.println(mc3.n);
		System.out.println(mc3.n2);
		System.out.println(mc3.s);
		System.out.println(mc3.s2);
		
		mc3.m1();
		mc2.m1();
		
		mc3.m1("HI");
		
		System.out.println(mc2.m2());
		System.out.println(mc3.m2());
	}

}
