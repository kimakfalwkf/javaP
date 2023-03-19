package print;

public class Print3 {
	//main 컨트롤 스페이스
public static void main(String[] args) {
	/*
	 * 여러줄 주석처리
	 * 
	 * 
	 * 이름: 홍길동
	 * 생일: 2000년  7월 15일
	 * 키 175.5cm
	 * */
	System.out.println("이름: 홍길동");
	
	//sysout/컨트롤 스페이스/하면 자동완성
	System.out.println(100 + 50);//간단한 연산도 가능
	System.out.println("100 + 50");//"있으면 그대로 출력
	System.out.println(100);
	System.out.println("안녕하세요"+10);//문장 뒤에 더해지는 숫자는 문자뒤에 붙는다
//자바에서는 " 안에 있으면 다 문자로 인식
System.out.println(5+10+":"+5+10);
System.out.println("2+2="+2+2);
System.out.println("2+2="+(2+2));

}

}
