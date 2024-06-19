package ch18.sec03.ex03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test_image.jpg");
		OutputStream os = new FileOutputStream("C:/Temp/test_image2.jpg");
		
//		byte[] data = new byte[1024];	// read 해서 담을 자료구조의 크기보다 파일이 클 때
//		while(true) {
//			int num = is.read(data);
//			if (num == -1) break;
//			os.write(data, 0, num);
//		}
		// 위랑 똑같은 기능
		is.transferTo(os);

		os.flush();
		os.close();
		is.close();
	}

}
