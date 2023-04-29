package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
public static void main(String[] args) {
	//test.t내용을 읽어서
	//대문자와 소문자의 개수를 출력
	
	//대문자: 몇개
	//소문자: 몇개
	
	//한글과 특수문자는 판단할 필요가 없습니다.
	int lower=0;
	int upper=0;
	
	
	try {
		FileReader fr=new FileReader("C:\\Users\\USER\\Desktop\\wwww\\tlqkf.txt");
		int code=0;
		
		while((code=fr.read()) != -1){
			if(code>='A'&&code<='Z') {
				upper++;
			}
			if(code>='a'&&code<='a') {
				lower++;
			}
		}
		System.out.println("대문자: "+upper+"개");
		System.out.println("소문자: "+lower+"개");
	
	 
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
