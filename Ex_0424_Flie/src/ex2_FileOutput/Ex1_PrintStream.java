package ex2_FileOutput;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		
//		ps.write('j');
//		ps.write('a');
//		ps.write('b');
//		ps.write('a');
//		
		byte[] by= {'j','a','b','a'};
		try {
			ps.write(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
