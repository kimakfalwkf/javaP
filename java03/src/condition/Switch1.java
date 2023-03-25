package condition;

import java.util.Scanner;

public class Switch1 {
public static void main(String[] args) {
		
	//제어문 : if / switch / while / for
	
	//조건문 : if / switch
	//if가 기본  switch는 같은 경우
	
	int num=0;
	if(num==0) {
		System.out.println("num은 0이다");
	}
	else if(num==1) {
		System.out.println("num은 1이다");
	}
	else if(num==2) {
		System.out.println("num은 2이다");
	}
	else {
		System.out.println("그 외");
	}
	//이렇게 같은 조건문은 switch 로 변경가능
	
	switch(num) {
	case 0:
	System.out.println("0이다");
	break;
	case 1:
	System.out.println("1이다");
	break;
	case 2:
	System.out.println("2이다");
	break;
	default:
		System.out.println("그 외");
	}
	//switch-case-break
	
	//퀴즈: 사용자 정수 입력받기
	//1: 안녕하세요
	//2: 반갑습니다
	//3: 잘있어요
	//4: 다시만나요
	//그 외: 잘못입력-
	
	int A=0;
	System.out.println("숫자를 입력해주세요>>");
	Scanner sc=new Scanner(System.in);
	A=sc.nextInt();
	 switch(A) {
	 case 1:
		 System.out.println("안녕하세요.");
		 break;
	 case 2:
		 System.out.println("반갑습니다.");
		 break;
	 case 3:
		 System.out.println("잘있어요.");
		 break;
	 case 4:
		 System.out.println("다시만나요.");
		 break;
		 default:
			 System.out.println("잘못 입력되었습니다.");
	 
	 }
	
	
	}
	}
