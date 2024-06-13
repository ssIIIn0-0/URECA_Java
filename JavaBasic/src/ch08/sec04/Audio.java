package ch08.sec04;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다.");
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
		System.out.println("현재 audio 볼륨은 " + this.volume);
	}
}
