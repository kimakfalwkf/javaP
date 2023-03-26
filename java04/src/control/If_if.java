package control;

public class If_if {
public static void main(String[] args) {
	//제어문 중쳡가능
	//if  안에 ㅑㄹ, for안에 if 등등
	
	int i=0;
	int j=0;
	
	if(i<0) {
		//0보다 작으면
		if(j<0) {
			
			System.out.println("i는 0보다 작다 j는 0보다 작다");
		}else if(j==0) {
			System.out.println("i는 0보다 작다 j는 0과 같다");
		}else {
			System.out.println("i는 0보다 작다 j는 0보다 크다");
		}
	}else if(i==0) {
		//0과 같으면
		if(j<0) {
			System.out.println("i는 0같다 j는 0보다 작다");
			
		}else if(j==0) {
			System.out.println("i는 0같다 j는 0과 같다");
		}else {
			System.out.println("i는 0같다 j는 0보다 크다");
		}
	}else {
		//0보다 크면 여기로
		
		int flag=1;
		
		if(flag !=0) {
			for(int i1=0;i1<5;++i1) {
				
			}
		}
		
		
		
		
		
	}
	//반복문 안에 조건문
	
	int num=1;
//	if(num==1) {
//		System.out.println("1이다");
//	}if(num==1) {
//		System.out.println("1이다");
//	}
//	if(num==1) {
//		System.out.println("1이다");
//	}
//	if(num==1) {
//		System.out.println("1이다");
//	}
	for (int ll=0;ll<5;++ll) {
		if(num==1) {System.out.println("1이다");}
		//반복수행시마다 조건문 실행
	}
	
	
	
	
	
}
}
