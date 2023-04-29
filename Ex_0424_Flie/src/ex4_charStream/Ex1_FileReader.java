package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
public static void main(String[] args) {
	//캐릭터 기반의 스트림은 ...리더...라이터의 자식클래스들을 사용
	//기본적으로 2바이트를 지원하기 때문에 2바이트 언어로 구성된 파일도
	//쉽게 입출력이 가능합니다
	
	
	try {
		FileReader fr=new FileReader("C:\\Users\\USER\\Desktop\\wwww\\tlqkf.txt");
	
		int code=0;
		
		while((code=fr.read()) != -1){
			System.out.print((char)code);
		}
	
	
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
