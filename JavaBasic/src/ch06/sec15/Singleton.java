package ch06.sec15;

public class Singleton {
	private static Singleton instance = new Singleton();
	// instance 변수는 static이니까 메소드 영역에 있다.
	// 하지만 new니까 힙에 만들어진 주소가 instance에 저장된다.
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}

// 왜 뜬금없이 싱글톤이 나와?
// 싱글톤 패턴을 적용하므로써 new 사용을 막고, 생성자의 private 접근을 제한하는 것이다.
// 이러면 외부에서 마음대로 객체를 생성하는게 불가능해진다.
// 대신 간접적으로 객체를 얻어야 뭘 할거아니야! -> 그래서 나온게 getInstance가 나온것이다.