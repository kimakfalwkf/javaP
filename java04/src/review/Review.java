package review;

import java.util.Scanner;

public class Review {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 1_10짝수만 출력
	// for(초기값;조건식;증감량){반복할 코드;}
	for (int i = 1; i <= 10; ++i) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
	}

	// 정수형태 비번 맞추기

//	int pw = 1234;
//
//	int ipt = 0;
//
//	for (int i = 0; i < 5; ++i) {
//		System.out.println("qjsgh dlqfur>>");
//		ipt = sc.nextInt();
//		if (ipt == pw) {
//			System.out.println("맞았습니다");
//			break;
//		}
//		if (i == 4) {
//			System.out.println("접속불가");
//		}
//	}
	
	//시험합격: 국영수가 각각 40이상 총점수가 150 이상이면 합격
	//40점 이하가 있으면 과락, 총점 미달시 총점미달 표기
	int k=40;
	int e=40;
	int m=100;
	
	int sum=k+e+m;
	
	if(k>40 && e>40 && m>40) {
		System.out.println("과락입니다.");
		
	}
	else if(sum<150) {
		System.out.println("총점미달입니다.");
	}
	else {
		System.out.println("합격입니다.");
	}
	//1-10까지의 합
	int l=0;
	for(int h=0;h<=10;h++) {
		l+=h;
	}
	System.out.println(l);
	
	//10-1거꾸로 출력
	int b=0;
	for(int a=10;a>=1;a--) {
		
		System.out.println(b);
	}
	
	
	
	
}
}
