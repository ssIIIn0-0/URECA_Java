package ch18.sec04;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		// 문자
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		// 1문자씩
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.print((char)data);	// 숫자(문자의 정수표현) 대신 문자로 표현하기 위해 casting
		}
		
		// 배열 읽기
		char[] data = new char[100];
		int num = reader.read(data);
		for (int i = 0; i < num; i++) {
			System.out.print(data[i]);
		}
		
		// 주의!
		// 1문자씩 읽기 + 배열 읽기를 모두하면, 이미 1문자씩 읽어서 배열 읽기에서는 읽을 데이터가 소진된다. 
		// 그래서 읽기는 1번만 하거나, 두 방법 모두 한번에 쓰고 싶으면,
		// reader = new FileReader("C:/Temp/test.txt"); 이걸 통해서 총 2번 읽어와야한다.
		// 읽을 데이터 가져오기 -> 읽기 -> 읽을 데이터 가져오기 -> 읽기 이렇게
		
		
		reader.close();
	}

}
