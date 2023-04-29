package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ByteCharReader {
public static void main(String[] args) {
	//바이트 스트림과  캐릭터 스트림의 연결
	
	File f=new File("C:/Users/USER/Desktop/java 수업/Ex_0424_Flie/src/ex2_FileInput");

	try {
		FileInputStream fis=new FileInputStream(f);
		//byte 기반의 스트림은 한줄 단위 처리가 안됨
		//BufferedReader가 필요(이건 혼자셔 객체를 못만든아 앞에 뭔가 있어야 함) 
		BufferedReader br =new BufferedReader(new InputStreamReader(fis));
		
		String str;
		while((str =br.readLine())!=null) {
			System.out.println(str);
		}
			
				if(br !=null) {
					br.close();
				}
				if(fis !=null) {
					fis.close();
				}
				
			
		}catch (Exception e) {
			// TODO: handle exception
		}



}
}
