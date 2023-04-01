package cls;

public class Class3 {
public static void main(String[] args) {
	자동차 나=new 자동차();
	자동차 엄마=new 자동차();
	
	나.차주="홍길동";
	나.차종="A";
	나.색상="검정";
	
	나.나열();
	
	
	엄마.차주="엄마";
	엄마.차종="B";
	엄마.색상="파랑";
	
	엄마.나열();
	
	
}
}
class 자동차{
	String 차주;
	String 차종;
	String 색상;
	
	void 나열() {
	System.out.println(차주+"의 차종은 "+차종+", 차 색상은 "+색상+"색 입니다.");
	}

}
