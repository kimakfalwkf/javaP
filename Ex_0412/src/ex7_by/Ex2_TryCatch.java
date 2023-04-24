package ex7_by;

public class Ex2_TryCatch {
public static void main(String[] args) {
	int res=0;
	int[]arr=new int[2];
	
	
	try {//컨트롤 스페이스로 형성
		res=10/0;
		arr[2]=10;
		
	} catch (ArithmeticException e) {
		
		System.out.println("정수는 0으로 나눌 수 없습니다");
		
		
		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("없는 방에 값을 넣을 수 없습니다.");
	}finally {
		//try 영역 내의 예외발생여부와 상관 없이 
		//마지막에 반드시 호출되는 영역
		System.out.println("finally");
	}
}
}
