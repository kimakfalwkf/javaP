package ex2_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
public static void main(String[] args) {
	try {
		FileOutputStream fos =new FileOutputStream("C:\\Users\\USER\\Desktop\\wwww\\fileOut.txt",true);
		//FileOutputStream fos =new FileOutputStream("C:\\Users\\USER\\Desktop\\wwww\\fileOut.txt");  //,true가 없으면 덮어쓰고 있으면 이어쓴다
	
//		fos.write('f');
//		fos.write('i');
//		fos.write('l');
//		fos.write('e');
		
		String msg="예제입니다.\n";
		String msg2="여러줄도 가능.\n";
		
		fos.write(msg.getBytes());  //getBytes:문자열을 바이트 배열로 바꿔주는 메서드
		fos.write(msg2.getBytes());
		
		fos.close();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
