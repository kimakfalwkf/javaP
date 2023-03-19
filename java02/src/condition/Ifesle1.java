package condition;

public class Ifesle1 {
public static void main(String[] args) {
	////if() {}  {}: (조건식), {}:조건식이 참일떄 나올 것
	//저간이 틑릴떄 다른코드 실행 하고싶다.
	//else{}
	int num=0;
	if(num>3) {
		System.out.println("조건이 맞을때 실행할 코드");
	}
	else {
		System.out.println("조건이 틀릴때 실행할 코드");
		
	}
	
	if(99<10) {
		System.out.println("10보다 작습니다");
	}
	else if(99<100) {
		System.out.println("100보다 작습니다");
		
	}
	else {
		System.out.println("그밖");
		
	}
	
	
}
}
