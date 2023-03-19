package opreater;

public class Oper2 {
public static void main(String[] args) {
	int 국=49;
	int 영 =40;
	int 수=60;
	
	//합계와 평균
	
	int 합=국+영+수;
	System.out.println("합계: "+합+"점");
	System.out.println("평균: "+(합/3.0)+"점");  //소수점 표기방법 1, 하나에 소숫점 주기
	System.out.println("평균: "+((double)합/3)+"점"); //방법 2 double쓰기
}
}
;