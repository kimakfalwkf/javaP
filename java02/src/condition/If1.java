package condition;

public class If1 {
public static void main(String[] args) {
	//프로그램 코드는 기본적으로 위 아래, 왼쪽에서 오른쪽으로 흐른다
	//이 흐름을 조정할 수 있는 문법이 '제어문'
	//제어문: 조건문, 반복문, 그 외 등등...
	//if, switch, while, for,while, for
	
	//조건문:if, switch
	//반복문:while, for, dowhile
	//기타제어문: while, for
	
	//if() {}: (조건식), {}:조건식이 참일떄 나올 것
	if(3>2) {
		System.out.println("조건이 맞습니다");
		System.out.println("실행");
	}
	int num=9;
	if(num<10) {
		System.out.println("숫자가 10보다 작습니다");
	}
	
	
}
}
