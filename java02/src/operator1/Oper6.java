package operator1;

public class Oper6 {
public static void main(String[] args) {
	//관계연산자
	//&&, ||, !
	//True false에 영향
	
	//&& : and 그리고/ 앞과 뒤가 모두 t여야만 t
	System.out.println(2>1 && 2==2);
	
	int 키=120;
	int 나이=14;
	
	//키는 130 이상 나이는 13살 이상
	boolean 참거짓=키>=130 &&나이>=13;
	System.out.println(참거짓);
	//&&둘다 참이여야 t
	
	
	//||: or(혹은)
	참거짓= 키>=130 ||나이>=13;
	System.out.println(참거짓);
	//둘 중 하나가 참이면 t
	
	//!:not/ 결과를 반대로 바꿔줌 t->f/f->t
	System.out.println(!참거짓);
}
}
