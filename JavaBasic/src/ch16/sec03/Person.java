package ch16.sec03;

public class Person {
	public void action1(Workable workable) {
		workable.work("시은", "programming");
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}
}
