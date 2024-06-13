package ch08.sec08;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOff();
		rc.turnOn();
//		rc.search();	// 이건 안됨(선언을 remoteControl로 해서)
		
		Searchable sch = new SmartTelevision();
		sch.search("123");
	}

}
