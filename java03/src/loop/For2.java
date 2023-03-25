package loop;

import java.util.Scanner;

public class For2 {
public static void main(String[] args) {
	//for문을 통해서 구현
	//1. 안녕 5번
	//1-10까지 합계
	//1-입력값까지 합계
	
	//1.
	for(int i=0; i<5; i++) {
		System.out.println("안녕");
	}
	//2.
	int sum=0;
	for(int j=0; j<=10; j++) {
		sum+=j;
	}

	System.out.println("1부터10의 합계"+sum);
	
	int sum1=0;
	int num=0;
	System.out.println("숫자를 입력해주세요>>");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	
	for(int k=0; k<=num; k++) {
		sum1+=k;
	}
	System.out.println("1부터"+num+"의 합계"+sum1);
	
	
}
}
