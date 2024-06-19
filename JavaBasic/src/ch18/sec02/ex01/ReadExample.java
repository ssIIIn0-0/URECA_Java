package ch18.sec02.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			// write 할 때 3개 했다는 걸 알고 있는 경우
//			byte a = (byte)is.read();
//			byte b = (byte)is.read();
//			byte c = (byte)is.read();
//			
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
			
			// 몇개를 write 했는지 모르는 경우
			while(true) {
				int data = is.read();
				if(data == -1)break;
				System.out.println(data);
			}
			
			is.close();
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
