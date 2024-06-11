package ch06.sec06;

// compiler 가 자동으로 해주는 것
// 1. java.lang 자동 import
// 2. class에 생성자가 없으면 기본 생성자를 추가
//		기본생성자 : 파라미터가 없는 생성자
public class MyClass {
	// field
	int n;			// 산안민 <= 0에 준하는 default value
	int n2 = 10;	// 선언 + 초기화
	
	String s;
	String s2 = new String("Hello");
	
	// constructor 생성자
	// 무뷴별하게 생성자를 여러개 만드는 것은 지양
	// pattern <= builder 패턴을 이용해서 필요하고 가독성이 높은 형태로 전환 필요
	public MyClass() {}
	public MyClass(int n) {
		this.n = n;		// 같은 필드에 있는 n
	}
	public MyClass(int n, int n2, String s, String s2) {
//		this.n = n;
		this(n);
		this.n2 = n2;
		this.s = s;
		this.s2 = s2;
	}
	// this. <= this heap에 만들어진 instance를 저장
	// this() <= 자신의 생성자를 호출
	
	// 메소드 overloading
	public void m1() {
		System.out.println(this.n + this.n2);
	}
	public void m1(String message) {
		if(message.equals("Quit")) return;
		System.out.println(message + this.s2);
	}
	
	public boolean m2() {
		return this.n > 4;
	}
}
