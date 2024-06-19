package singleton;

public class Test {// application 역할

	public static void main(String[] args) {
		
		// 이렇게 하면 객체가 2개 만들어짐
//		Logger logger = new Logger();
//		Logger logger2 = new Logger();
//		하지만, Logger는 app 을 통틀어서 단 하나의 객체만 만들거라 생성자를 private으로 구현함(위 처럼 new 로 객체생성X)
		// static 필요 왜???
		
		Logger logger = Logger.getInstance();
		System.out.println(logger);
		logger.log("첫 번째 로그 입니다.");
		
		m();
	}

	public static void m() {
		Logger logger = Logger.getInstance();
		System.out.println(logger);
		logger.log("두 번째 로그 입니다.");
	}
}
