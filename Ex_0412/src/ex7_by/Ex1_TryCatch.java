package ex7_by;

public class Ex1_TryCatch {
public static void main(String[] args) {
	//자바에서 프로그램이 실행되는 도중 예외(오류, 버그, 에러)가 발생하면 그 시점에서
	//프로그램이 종료된다. 하지만 예상가능항 올류나 오류 발생시 이를 무시하고
	//이후의 작업을 진행햐야 하는 경우.
	//예외처리를 통해 프로그램의 비정상적인 종료를 줄여보자.
	
	//예상가능한 오류: 키보드에서 값을 받을 떄 원하는 타입이 아닌 다른 타입으로 받으면 나는 오류
	
	int result =0;
	char[]arr=new char[3];
	
	
	try {//컨트롤 스페이스로 형성
		result=10/0;
		arr[3]='a';
		
	} catch (Exception e) {
		e.printStackTrace();  
		//ArithmeticException: 정수를 0으로 나누려 하는 예외
		//ArrayIndexOutOfBoundsException: 없는 방에 값을 넣으려 할때 발생하는 예외
		
		
		//System.out.println("정수는 0으로 나눌 수 없습니다");
		//System.out.println("없는 방에 값을 넣을 수 없습니다.");
		
		
		
	}

}
}
