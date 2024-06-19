package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputExample {

	public static void main(String[] args) throws Exception{
//		OutputStream os = new FileOutputStream("primitive.db");
//		DataOutputStream dos = new DataOutputStream(os);
//		
//		dos.writeUTF("시은");
//		dos.writeDouble(99.1);
//		int num = 100;
//		dos.writeInt(num);
//		
//		dos.writeUTF("시은2");
//		dos.writeDouble(89.0);
//		num = 200;
//		dos.writeInt(num);
//		
//		dos.flush();
//		dos.close();
//		os.close();

//		InputStream is = null;
//		DataInputStream dis = null;
		// try() 안에서 선언, 생성된 resource 객체 (AutoClosable 구현) 는 자동으로 close()
		try (InputStream is = new FileInputStream("primitive.db");
			 DataInputStream dis = new DataInputStream(is);
		){
			for (int i = 0; i < 2; i++) {
				System.out.println(dis.readUTF());
				System.out.println(dis.readDouble());
				System.out.println(dis.readInt());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
//			try {
//				dis.close();
//				is.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		}
	}

}
