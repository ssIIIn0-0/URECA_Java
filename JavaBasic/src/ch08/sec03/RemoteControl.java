package ch08.sec03;
// 전원 켜는 기능에 대한 약속, 규칙을 공유
public interface RemoteControl {
	int MAX_VALUME = 10;	// public static final이 생략된 상태
	int MIN_VALUME = 0;		// public static final이 생략된 상태
	
	void turnOn();
	
}
