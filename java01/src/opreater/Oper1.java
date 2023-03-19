package opreater;
//파일명 변경시 파일 클릭하고 f2
public class Oper1 {
public static void main(String[] args) {
	//프로그래밍은 기본적으로
	//위에서 아래, 왼쪽에서 오른쪽으로 진행
	
	int num1=3;  //대입연산자= :오른쩍에 있는 값을 왼쩍의 공간에 담아라
	int num2=2;
	System.out.println(num1-num2*num2);
	System.out.println((num1-num2)*num2);
	
	System.out.println(8/4/2);
	System.out.println(8/(4/2));
	
	//자료형이int정수여서 나누기 후 소숫점은 삭제
	
	System.out.println(3/2);
	System.out.println(3/2.0); //소숫점있는 숫자로 입력

}
}
