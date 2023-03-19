package operator1;

public class Review {
public static void main(String[] args) {
	//면수 : 저장공간
	//자주면경될 수 있는 부분은 저장하고 돌려쓰기
	String A="글자를 저장";
	int num=0; //숫자
	
	System.out.println(num);
	//컨트롤 +f11
	System.out.println("나는 "+A+num);
	
	//산술연산자
	//+, _, *, /, %
	
	String 문자열더하기="글자를 "+"붙이기";
	int 정수더하기=3+4; //7
	int 정수빼기=3-4;
	int 정수곱하기=3*4;
	int 정수나누기=3/4;
	double 실수나누기=3.0/(double)4;
	
	System.out.println(문자열더하기);
	System.out.println(정수더하기);
	System.out.println(정수빼기);
	System.out.println(정수곱하기);
	System.out.println(정수나누기);
	System.out.println(실수나누기);
	
	//비교연산자
	//> < >= <= == !=
	//결과를 참 거짓으로
	System.out.println(3>4);
	System.out.println(3<4);
	System.out.println(3>=4);
	System.out.println(3<=4);
	System.out.println(3==4);
	System.out.println(3!=4);
	//컨트롤 알트 아래방향 =복사

	//대입엽산자 =
	//오른쪽의 값을 왼쪽의 변수에 담겠다.
	
	A="abc";  //abc를 '글자'라는 변수에 담겠다
	
	String 변수1;
	변수1="이미 만들어진 변수에는 자료형 없이 적는다. ";
	String 변수2="새로 만드는 변수에는 자료형을 적어줘야한다";
	System.out.println(변수1+변수2);
			
	
}
}
