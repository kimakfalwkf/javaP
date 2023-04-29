package ex1_file;

import java.io.File;

public class Ex1_File {
public static void main(String[] args) {
	//IO입출력 스트림:input output
	//스트림이란, 데이터를 입출력하기 위한 통로
	//
	
	
	//File 객체를 생성할 경로
	
	 String path="C:\\Users\\USER\\Desktop\\java 수업\\test.txt";
	 
	 //준비된 경로로 파일 객체 형성
	 
	File f=new File(path);
	//File 클래스가 형성되면서 path경로까지 스트림을 생성
	
	//isFile:파일 클래스가 접급한 최종목적지가 파일형식일 경우 참, 아닐경우 거짓 출력
	//length():파일의 용량을 가져올수 있다 ㅘㄴ글은 1개당 2byte, 영어는 1개당 1byte
	if(f.isFile()) {
		System.out.println(f.length()+"byte");
	}
	
	
	
}
}
