package ch07.sec03;

public class SmartPhone extends Phone{	// is a 관계
	// 부모 클래스에 없어서 추가로 생성
	public boolean wifi;
	public String color = "blue";
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		// super, this 뭘로 접근해도 가능함
		// 다만, super은 무조건 부모꺼, this는 내꺼먼저, 내꺼없으면 부모꺼
		// 여기서는 color가 예시고 문법자체는 맞지만, 좋은 방법은 아니다.
//		System.out.println(super.model);
//		System.out.println(super.color);
		System.out.println(this.model);
		System.out.println(this.color);
	}

	public SmartPhone(boolean wifi) {
		super();	// 직접 작성하지 않으면 컴파일러가 자동으로 넣어줌.
		
		// but 부모 클래스가 파라미터를 가진 생성자를 가진다면?
		// 부모 클래스의 파라미터에 맞는 생성자를 작성해줘야함 super안됌.
		// 그래서 부모클래스의 생성자는 default 생성자를 갖는 것을 권함.
		
		this.wifi = wifi;
	}
	
	// 부모클래스의 생성자에 파라미터를 넣는 경우,
	// 부모클래스 파라미터 + 본인 클래스 파라미터
	public SmartPhone (String model, String color, boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	
}
