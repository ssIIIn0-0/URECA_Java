package ch07.sec03;

public class Phone {
	// encapsulation 생각하기. 여기선 상속배우려고 public 으로 진행
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public Phone() {}
//	public Phone (String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	자식클래스를 가지는 부모클래스가 생성자에 파라미터를 넣으면,
//  자식클래스에서 생성자를 만들 때 super을 사용할 수 없기때문에 오류가 난다.
//	그래서 부모클래스에서는 기본 생성자를 사용하는 것이 좋다
	
	// 굳이 써야겠다, 이렇게 쓰고 자식클래스의 생성자를 수정하면 됌
	public Phone (String model, String color) {
		this.model = model;
		this.color = color;
	}
}
