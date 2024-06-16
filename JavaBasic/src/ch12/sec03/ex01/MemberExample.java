package ch12.sec03.ex01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// println(객체) <- 객체.toString
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		// == 객체의 참조(주소, 번지) 값 비교
		System.out.println(obj1 == obj2);	// F
		System.out.println(obj2 == obj3);	// F
		
		// "blue"에 대한 equals() 비교
		// equals()는 Object의 equals() 상속
		// Object의 equals()는 == 을 사용
		// 따라서, equals(), == 는 같은 기능을 가짐e
//		System.out.println(obj1.equals(obj2));	// F
		
		// 하지만, Member.java에서 equals(), == 을 다른 기능을 가지게 하려고
		// 오버라이드로 equals을 재정의함
		System.out.println(obj1.equals(obj2));	// T
	}

}
