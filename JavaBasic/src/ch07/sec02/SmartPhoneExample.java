package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// 자식이 가진 함수는 부모는 사용 불가
		Phone phone = new Phone();
		phone.model = "galaxy";
		System.out.println(phone.model);
		
		// 부모 객체 Phone이 만든 함수
		SmartPhone sPhone = new SmartPhone();
		sPhone.model = "IPhone";
		System.out.println(sPhone.model);
		sPhone.bell();
		sPhone.receiveVoice("HIHIHIHI");
		
		// 본인 sPhone이 만든 함수
		sPhone.setWifi(true);
		System.out.println(sPhone.wifi);
		sPhone.internet();
	}

}
