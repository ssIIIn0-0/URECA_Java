package ch13.sec04;

public class GenericExample {

	// T 에는 Number 포함 Number 를 상속받은 하위 클래스만 오도록 제한
	public static <T extends Number> boolean compare (T t1, T t2) {
		return t1.doubleValue() == t2.doubleValue();
	}
	public static void main(String[] args) {
		System.out.println(compare(10, 20));
		System.out.println(compare(1.0, 1.0));
//		System.out.println(compare("hello", "hello"));	// string은 Number를 상속받은 하위클래스가 아님

	}

}
