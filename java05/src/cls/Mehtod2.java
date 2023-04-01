package cls;

public class Mehtod2 {
public static void main(String[] args) {
	my5 mc5=new my5();
	mc5.메서드1();
	mc5.메서드1();
	System.out.println("끼어들기");
	
	mc5.메서드1();
	
	mc5.메서드2("안녕하세여","감사해요");
	//반환값이 있으면 변수로 담는 형태로 사용
	//메서드3이  String으로 반환햊기 떄문에
	
	String result3=mc5.메서드3(); //메서드 3을 사용!
	result3=mc5.메서드3();        //메서드 3을 사용!
	System.out.println(result3);//반갑습니다
	
	
	
		mc5.메서드4(1.6);
		int result4=mc5.메서드4(3.7);
		System.out.println(result4);
		
		result4=mc5.메서드4(3.3);
		System.out.println(result4);
		System.out.println(mc5.메서드4(5.5)); //변수처럼도 사용가능
		}
	}

	
class my5{
	//메서드1: 반환값x, 입력값x(오로지 저장목록, 가독성
	void 메서드1() {
		//입력값이 없으면 ()을 비워놓습니다.
		//반환값이 없으면 자료형은 void 로 하고 return은 생략
		
		//오로지 코드 재사용
		int num=1;
		System.out.println("나는 메서드"+num+"에 저장된 코드다");
		
	}
	
	//메서드2: 반환값x 입력값o(코드 재활용, 일부 변수만 사용)
	void 메서드2(String str1, String str2) {
		//입력갓이 있으면 입력받고자 하는ㄴ 값의 변수들을 생성해 놓는다
		//반환값이 없으면 자료형은 void retrun은 생략
		System.out.println("소괄호로 넘어오는 값만 변경"+str1);
		System.out.println("코드 재활용 "+str2);
	}
	
	
	
	//메서드3: 반환값o, 입력값x(코드 재사용 마지막에 전달할 값이 있음
	String 메서드3() {
		String re="반갑습니다.";
		System.out.println("메서드 3을 사용!");
		
		return re;
	}
	//메서드4: 반환값o, 입력값o
	int 메서드4(double dnum) {
		// 입력값이 있으면 ()를 변수로 채워놓고
		// 반환값이 있으면 return을 사용하고 맨 앞의 자료형을 맞춰준다
		System.out.println("실수 자료형을 반올림합니다.");
		double result = dnum - (int)dnum;		// 소수점 부분만 남겠죠?
		if(result >= 0.5) {
			dnum += 1.0;		// 만약에 소수점 부분이 0.5보다 컸다면 +1
		}
		
		return (int)dnum;		
		// 소수점부분 날린다
	}
}

