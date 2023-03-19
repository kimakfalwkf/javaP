package condition;

import java.util.Scanner;

public class Ifelse3 {
public static void main(String[] args) {
	
	
	//변수= sc.nextInt(); 
	
	
	//1. 20세 이상 성인, 14- 20은 청소년 14세 미만은 어린이
	int age=0;
	System.out.println("나이>> ");
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	
	if(age>=20) {
		System.out.println("성인입니다.");
	}
	else if(age>=14 && age<20) {
		System.out.println("청소년입니다.");
	}
	else{
		System.out.println("어린이입니다.");
	}
	
	//2. 학점 90>a/80>b 70>c 그 외 d
	
	int g=0;
	System.out.println("학점을 입력>> ");
	Scanner sc2=new Scanner(System.in);
	g=sc2.nextInt();
	
	if(g>=90) {
		System.out.println("A");
	}
	else if (g>=80) {
		System.out.println("B");
	}
	else if (g>=70) {
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}
	
	//3.비밀번호를 정해놓고 맞으면 맞다 틀리면 다릅니다 출력
	int Q=0;
	
	System.out.println("4자리 비밀번호>> ");
	Scanner sc3=new Scanner(System.in);
	Q=sc3.nextInt();
	
	if(Q==1234) {
		System.out.println("비밀번호가 맞습니다");
	}
	else {
		System.out.println("비밀번호가 다릅니다");
	}
	
	//4. 윤년 판별하기
    int Y=0;
	
	System.out.println("년도>> ");
	Scanner sc4=new Scanner(System.in);
	Y=sc4.nextInt();
	int Y1=Y&4;
	int Y2=Y&100;
	int Y3=Y&400;
	
	if(Y1==0 && (Y2!=0 || Y3==0) ) {
		System.out.println("윤년입니다");
	}
	else {
		System.out.println("윤년이 아닙니다");
	}
	
	//드래그 컨트롤 슬래쉬 한번에
	
}
}
