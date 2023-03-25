package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//if문
		//if(){ else if    else  }
		//if(){}: ()에는 조건식을 {}에는 코드를
		
		//예제 버스카드 20세 이상이면 성인 1000원 14-19면 천소년 690원 13세 이하는 300웜
		
		int age=19;
		int M=0;
		if(age> 19) {
			
			System.out.println("성인입니다");
			M=1000;
		}
		else if(age>13) {
			System.out.println("청소년입니다");
			M=650;
		}
		else {
			System.out.println("어린이입니다");
			M=400;
		}
		System.out.println(M+"원");
		
		//4. 윤년 판별하기
		int Y=0;

		System.out.println();
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

	}
}


