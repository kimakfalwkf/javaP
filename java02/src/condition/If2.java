package condition;

import java.util.Scanner;

public class If2 {
public static void main(String[] args) {
	int num=0;
	//사용자에게 입력받기
	Scanner sc=new Scanner(System.in);
	
	
	System.out.print("숫자를 입력하세요>>");
	num= sc.nextInt();  //사용자가 입력한 숫자를 num변수에 입력
	
	
	//System.out.println("입력한 숫자는> "+num);
	
	if(num<10) {
		System.out.println("숫자는 10보다 작습니다.");
	}
			
	
}

}
