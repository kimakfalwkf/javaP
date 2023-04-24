package ex7_by;

import java.util.Scanner;

public class Ex3_TryCatch {
public static void main(String[] args) {
	//문제:
	//키보드에서 정수를 입력받게 하고 정수 이외의 값 입력시
	//"정수만 입력가능 메세지 출력
	

	Scanner sc=new Scanner(System.in);
	
	

	
	try {
		System.out.println("정수: ");
		int a=sc.nextInt();
		
		System.out.println("입력받은 수: "+a);
	} catch (Exception e) {
		System.out.println("정수만 입력가능");
	}
}
}
