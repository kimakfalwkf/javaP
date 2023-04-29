package ex2_FileInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_BufferedInputEx {
public static void main(String[] args) {
	//
	
	FileInputStream fis=null;
	BufferedInputStream bis=null;
	
	byte _byte[]=new byte[100];
	byte result[]=new byte[100];
	
	
	try {
		System.out.print("경로입력 : ");
		System.in.read(_byte);//스캐너 역할
		
		String path =new String(_byte).trim(); //trim:남는공간 제거
		
		//"C:\\Users\\USER\\Desktop\\wwww\\tlqkf.txt"을 여기 불러올 것
		 fis=new FileInputStream(path);
		 bis=new BufferedInputStream(fis);
		 
		 bis.read(result);
		System.out.println(new String(result).trim());
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(bis !=null) {
				bis.close();
			}//닫는건 역순이 좋다
			if(fis !=null) {
				fis.close();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
}
