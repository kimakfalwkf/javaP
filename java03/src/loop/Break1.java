package loop;

public class Break1 {
public static void main(String[] args) {
	//제어문에는 같이 쓰잉ㄹ 수있는 break와 ciotinue 가 있다
	//break: 자기를 감싸는 반복문을 강제 종료
	while(true) {
		System.out.println("무한반복");
		
		if(true) {
			break; //자신을 감싼 반복문을 끝냄
		}
		System.out.println("반복문 종료되어 이곳은 경유하지 않습니다.");
	}
	System.out.println("반복문 종료.");
	
	for(int i=1; i<=10; i++) {
		if(i>3) {
			break;//i>3일때 반복문 종료
		}
	//1-10
	System.out.println(i+" ");
	
	}
}
}
