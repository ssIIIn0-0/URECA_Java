package ch18.sec04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception{
		// 문자
		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		// ch 한글자
		char a = 'A';
		writer.write(a);
		
		char b = 'B';
		writer.write(b);
		
		// ch 배열
		char[] array = {'C', 'D', 'E'};
		writer.write(array);
		
		// 문자열
		writer.write("FGH");
		
		writer.flush();
		writer.close();
	}

}
