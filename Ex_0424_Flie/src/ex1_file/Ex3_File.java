package ex1_file;

import java.io.File;

public class Ex3_File {
public static void main(String[] args) {
	String path="C:\\Users\\USER\\Desktop\\java 수업\\aaa\\bbb";
	
	File f=new File(path);
	
	//!f.exists(): 파일클래스가 path 경로로 찾아가는중
	//정상적으로 폴더나 파일이 존재한다면 true 반환
	
	
	//.mkdirs(): make directories의 약자/디렉토리는 폴더를 의미
	if(!f.exists()) {
		System.out.println("폳더 생성!");
		f.mkdirs();
	}
	
//	if(f.exists()) {
//		System.out.println("폳더 삭제!");
//		f.delete();
//	}
	
}
}
