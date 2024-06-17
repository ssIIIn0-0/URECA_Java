package ch13.sec03.ex01;

public class GenericExample {

	// static generic method
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		
		// Box라는 제네릭을 바로 사용하지 않고 메소드를 사용
		Box<Integer> box1 = boxing(100);
		System.out.println(box1.get());
		
		Box<String> box2 = boxing("시은");
		System.out.println(box2.get());
	}

}
