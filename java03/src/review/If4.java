package review;

import java.util.Scanner;

public class If4 {
public static void main(String[] args) {
		//복습퀴즈
		
		String str="";
		int num=0;
		double dnum=0.0;
		dnum=(double)num;
		str=Integer.toString(num);
		num=Integer.parseInt(str);
		
		//사용자에게 정수를 입력받고 천의 자리로 , 넣기
		
				//100>>100
				//1000>>1,000
		
		System.out.println("정수를 입력해주세요.");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		int T=0;
		int t=0;
		String str_n=null;
		
		if(num<=999) {
			System.out.println(num);
		
		}
		else if(num>999) {
			T=num/1000;
			t=num-T*1000;
			if(t<10) {
				str_n="00"+t;
			}else if(t<100) {
				str_n="0"+t;
			}else if(t<1000) {
				str_n=""+t;
			}
			System.out.println(T+","+str_n);
		}
		
	}
	}
    
