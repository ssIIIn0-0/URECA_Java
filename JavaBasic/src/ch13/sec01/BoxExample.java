package ch13.sec01;

public class BoxExample {

	public static void main(String[] args) {
		// 제네릭 객체 생성방법
//		Box<String> box = new Box<String>();
		Box<String> box = new Box<>();
		box.content = "Hello";
		
		Box<Integer> box2 = new Box<>();
		box2.content = 3;
//		box2.content = "Hello";	// 이건 안됨. box2의 타입을 integer로 정해서

	}

}
