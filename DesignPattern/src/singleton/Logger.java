package singleton;

import java.time.LocalDateTime;

// app 전체에서 log 를 담당하는 클래스
// 이 클래스의 객체는 app 을 통틀어서 단 한개만 만들어서 사용되도록 한다.
public class Logger {

//	static {
//		// 미리 선작업
//		logger = new Logger();
//	}

	// private static Logger 변수
//	private static Logger Logger = new Logger();
	private static Logger Logger;
	// 생성자를 private로
	private Logger() {}
	
	// static 메소드로 외부에서 객체를 얻을 수 있는 방법 제공
	// 메소드로 객체를 생성할 수 있는 방법 제공
	public static Logger getInstance() {
		if(Logger == null) {
			Logger = new Logger();
		}
		return Logger;
	}
	
	public void log (String message) {
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfMonth();
		String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
		
		System.out.println("[" + date + " " + time + "]" + message);
	}
	
	
}
//싱글톤 객체 만드는 방법
//1. 변수에 private 생성자에 new로 접근해서 객체를 먼저 넣고 return
//private static Logger Logger = new Logger();
//이건 객체를 사용하기도 전에 미리 만드는 거라 객체가 클 경우 메모리 부담이 있음

//2. 변수 선언만 하고 getInstance에서 객체 생성을 확인 후 생성
//private static Logger Logger;
//...
//public static Logger getInstance() {
//	if(Logger == null) {
//		Logger = new Logger();
//	}
//	return Logger;
//}
//이건 getInstance를 실행할 때마다 if문을 거치므로 과정이 추가된다

//3. static block에서 객체 생성
//	static {
//		미리 선작업
//		logger = new Logger();
//	}




