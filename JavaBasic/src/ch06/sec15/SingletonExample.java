package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton st1 = new Singleton();
//		Singleton st2 = new Singleton();
//		Singleton st3 = new Singleton();
//		Singleton st4 = new Singleton();
//		System.out.println(st1 == st4);	// false : new로 객체를 총 4개 만들었음
//		Singleton자체가 private이라 이렇게는 못씀
		
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
		Singleton st4 = Singleton.getInstance();
		// st1~4는 stack에 있다. 왜? 그냥 인스턴트 타입이니까
		System.out.println(st1 == st4);	// true
	}

}
