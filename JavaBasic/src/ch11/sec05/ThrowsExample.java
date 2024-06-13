package ch11.sec05;

import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) throws FileNotFoundException{
		// 알고리즘 풀 때는 예외가 중요한게 아니니까, 그냥 main 옆에 throws Exception 붙이고 넘겨!
		A a = new A();
		//a.ma();
	}
}
