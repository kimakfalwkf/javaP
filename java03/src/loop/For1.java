package loop;

public class For1 {
public static void main(String[] args) {
	//for문
	//반복문: for.args while
	
	//while 가독성이 떨어짐
	
	//0-9까지 출력 while
	int i=0;
	while(i<10) {
		System.out.println("while: "+i);
		i++;
		
	}
	
	//while 단점: 바깥에 플래그를 만들어줘야함 {} 안에서 플래그 증감>>가독성이 낮음
	//for:플래그를 ()안에 몰고 {}엔 반복할 코드만 남김>>가독성이 좋고 개발이 편리함
	
	for(int j=0; j<10; j++) {
		System.out.println("for: "+j);
	}
	//for 단점: 자유도가 딸어짐
	
}
}
