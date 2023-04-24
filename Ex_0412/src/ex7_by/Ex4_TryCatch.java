package ex7_by;

import java.util.Scanner;

public class Ex4_TryCatch {
public static void main(String[] args) {
	//정수:100
	//결과: 100
	
	//정수:aa
	//aa는 정수가 아닙니다
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("정수를 입력해주세요: ");
	String bb="";
	
	try {
		bb=sc.next();
		int num=Integer.parseInt(bb);//문자열을 정수로 바꾸는 법
				System.out.println("결과: "+num);		
	} catch (Exception e) {
		
		System.out.println(bb+"는 정수가 아닙니다.");
	}
	
	
	
	
	
	
	
}
}
