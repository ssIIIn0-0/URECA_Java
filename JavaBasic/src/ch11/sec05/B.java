package ch11.sec05;

import java.io.FileNotFoundException;
import java.io.IOException;

//public class B {
//	public void mb() throws FileNotFoundException{
//		C c = new C();
////		c.mc();	// mc라는 메소드는 파일이 없을 수 있어! 라고 오류
//		// 해결하려면 , try-catch / throw 위로 넘기기
////		try {
////			c.mc();
////		}catch(FileNotFoundException e) {
////			e.printStackTrace();
////		}
//		c.mc();
//	}
//}

public class B {
public void mb() throws IOException{
	C c = new C();
	try {
		c.mc();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		throw new IOException();	// 예외를 발생시키는 코드
	}
}
}
