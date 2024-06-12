package ch06.sec10.ex02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	// 메모리에 load 될 때 실행되는 static block
	static {
		System.out.println("static...");
		info = company + "-" + model;
	}
	static {
		System.out.println("static2...");
	}
}
// 출력이
// static...
// static2...
// MyCompany-LCD
// 이렇게 나오는데, 관련 영상 6/12 9:30~40사이에 있음 다시 보기