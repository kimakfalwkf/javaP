package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path="C:\\Users\\USER\\Desktop\\java 수업";
		//최종 목적지가 폴더이면 하위 목록들의 이름을 가져올 수 있습니다.
		File f= new File(path);
		
		//!f.isFile()
		//!f.isDirectory():최종 목적지가 폴더이면 참
		if(f.isDirectory()) {
			String[] names=f.list();
			//f경로의 하위 요소들을 문자배열형태로 반환
			
			//name이 들아간 자리: 배열, 어레이 리스트 자리
			for(String s: names) {
				System.out.println(s);
			}
		}	
	}
	
	
	
}
