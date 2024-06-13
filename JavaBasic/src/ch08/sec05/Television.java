package ch08.sec05;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("television를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("television를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		}else if (volume < RemoteControl.MIN_VALUME) {
			this.volume = RemoteControl.MIN_VALUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 television 볼륨은 " + this.volume);
	}
}
