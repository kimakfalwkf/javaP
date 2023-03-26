package control;

public class For_for {
public static void main(String[] args) {
	//반복문 안에 반복문
	//한번 반복할떄마다 안쪽의 반복문을 수행
	for(int i=0;i<2;i++) {
		System.out.println("==i:"+i);
		for(int j=0;j<3;j++) {
			//System.out.println("i="+i+", j="+j);
			System.out.println("j:"+j);
		}
		System.out.println(); //안쪽 for 문이 끝나면 한줄 바꾸기
	}
}
}
