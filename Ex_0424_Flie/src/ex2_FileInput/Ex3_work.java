package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3_work {
    //file.txt의 내용을 FileInputStream읽어온 후
	//이것이 회문인지 판별하시오
	public static void main(String[] args) {
	
		String path="C:\\Users\\USER\\Desktop\\wwww\\FILE.txt";
		
		File f=new File(path);
		byte[] read=new byte[(int)f.length()];
		if(f.exists()) {
			try {
				FileInputStream fis= new FileInputStream(f);
				fis.read(read);
				
				
				String ori=new String(read);
				String rev="";
				
				for(int i=ori.length()-1; i>=0;i--) {
					rev+=ori.charAt(i);
				}
				if(ori.equals(rev)) {
					System.out.println(ori+" 는 회문입니다 ");
				}else {
					System.out.println(ori+" 는 회문이 아닙니다 ");
				}
				
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
