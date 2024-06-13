package ch08.sec02;

public class Television implements RemoteControl{
//	public void turnOnTelevision() {
//		System.out.println("television를 켭니다.");
//	}
	
	@Override
	public void turnOn() {
		System.out.println("television를 켭니다.");
	}
}
