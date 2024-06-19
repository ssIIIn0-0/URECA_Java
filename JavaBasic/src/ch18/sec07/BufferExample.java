package ch18.sec07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception{
		// copy() 입출력 stream
		InputStream is = new FileInputStream("C:/Temp/image.jpg");
		OutputStream os = new FileOutputStream("C:/Temp/image2.jpg");
		
		
		// copy() 입출력 + buffer stream
		InputStream is2 = new FileInputStream("C:/Temp/image.jpg");
		OutputStream os2 = new FileOutputStream("C:/Temp/image2.jpg");
		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		
		long nonBufferTime = copy(is, os);
		System.out.println(nonBufferTime);
		
		long BufferTime = copy(bis, bos);
		System.out.println(BufferTime);
		
		is.close();
		os.close();
		
		bis.close();
		bos.close();
		is2.close();
		os2.close();
		
	}
	
	// 복사를 전담하는 static method
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		// 복사
		while (true) {
			int data = is.read();
			if (data == -1) break;
			os.write(data);
		}
		long end = System.nanoTime();
		
		return end - start;
	}

}
