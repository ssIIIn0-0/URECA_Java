package ch08.sec05;

public class test {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(-10);
		rc.setMute(true);	// default method 호출
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc.setMute(true);	// public method 호출
		rc.setMute(false);
	}

}
