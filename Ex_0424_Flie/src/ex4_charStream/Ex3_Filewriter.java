package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_Filewriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\wwww\\FileWriter예제.txt");
		
			fw.write("첫번째 줄 작성.");
			fw.write("\n");
			fw.write("두번째 줄도 문제없음.");
			
			fw.close();
			
			
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
