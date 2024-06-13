package ch08.sec05;

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
	
	// 부모클래스인 RemoteControl에서는 default였는데,
	// 부모클래스보다 범위가 작으면 안되니까 public 으로 변경
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("재정의 무음 처리");
			setVolume(MIN_VALUME);	// 구현부를 가지는 default 메소드에서 위 추상 메소드를 호출
		}else {
			System.out.println("재정의 무음 해제");
		}
	}
}
