package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
public static void main(String[] args) {
	//파일 안에 내용을 읽어오기 위해서는 FileInputStream 이라고 하는 클래스가 할 수 있다
	//파일을 읽어오는 스트림은 ...
	//stream: byte 기반의 스트림->1바이트씩 읽음
	//...Reader,...Wirter: char 기반의 스트림-> 2바이트씩 읽음
	
	String path="C:\\Users\\USER\\Desktop\\java 수업\\test.txt";
	
	File f=new File(path);  //생략 가능하다, 하지만 확실한 확인을 위해 사용
	
	if(f.exists()) {//파일이 존재할떄만 수행해라
		try {
			FileInputStream fis=new FileInputStream(f);
			int code=0;
			
			while( (code = fis.read())!=-1) {//뭔지 보르는 파일을 다 읽어봐야 해서 와일문 사용
				//!=-1인 이유:read()메서드는 한번에 1바이트씩 읽다가 더 읽을 것이 없다면 
				//문장의 끝인 -1을 가져온다
				//아스키코드에도 유니코드에도 -1에 해당하는 글자ㅏ가 없기 떄문에 끝은 -1이다
			
				System.out.println((char)code);//코드는 정수라 형 변환 필요//한글 출력 안되는거 정상
			}
			fis.close();
			
		} catch (Exception e) {//FileNotFoundException를 Exception으로 바꾸기/ 아니면 트라이에서 트라이 캐치 하나더 형성
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
}
