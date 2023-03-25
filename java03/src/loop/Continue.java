package loop;

public class Continue {
public static void main(String[] args) {
	//continue:반복문의 시작점으로 돌아감,()로 돌아감,밑의 코드 무시
	
	int i=0;
	while(i<10) {
		i++;
		if(i%2==1) {continue;}//홀수일때 위로 올라가겠다.
		System.out.println("while "+i);
		//while의 컨티뉴: 무조건 ()로 이동해서
	}
	for(int j=0; j<10;j++) {
			if(i%2==1) {continue;}
		System.out.println("for: "+j);
		
		//if의 컨티뉴 ()이동해서 증감량 계산 먼저 하고 조검식 검사
	}
}
}
