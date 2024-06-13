package ch08.sec02;

// Test 클래스가 Audio, Television 객체의 기능을 사용하는 입장
public class Test {
	public static void main(String[] args) {
//		Audio audio = new Audio();
//		RemoteControl audio = new Audio();
//		RemoteControl audio = getAudio();
//		audio.turnOn();
		RemoteControl rc = getRemoteControl("audio");
		rc.turnOn();
		
//		Television tv = new Television();
//		RemoteControl tv = new Television();
//		RemoteControl tv = getTelevision();
//		tv.turnOn();
		RemoteControl rc2 = getRemoteControl("tv");
		rc2.turnOn();
	}
	
	public static Audio getAudio() {
		return new Audio();
	}
	public static Television getTelevision() {
		return new Television();
	}
	public static RemoteControl getRemoteControl (String clsf) {
		if (clsf.equals("audio")) {
			return new Audio();
		}else if(clsf.equals("tv")) {
			return new Television();
		}
		return null;
		
	}
}

// WebApp에서 DB를 사용하고 싶을 때, Oracle, MySQL, MS-SQL...등등이 있을거임
// 근데 만약 DBMS 마다 java CRUD 작업을 수행할 때 각각 다 다르면?
// DB가 바뀔때 마다 ㅈㄴ 귀찮을거임

// 그래서 인터페이스가 필요하게 된거임 왜? 일관된 함수? 를 만들기 위해서
// 여기도 RemoteControll이라는 interface를 만들어서 Audio와 Television의 turnOn함수를
// 정리? 한거임 -> coupling해소
