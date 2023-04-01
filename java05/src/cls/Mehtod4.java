package cls;

public class Mehtod4 {
public static void main(String[] args) {
	my7 mc7=new my7();
	
	System.out.println(mc7.더하기(4, 1));
	System.out.println(mc7.빼기(4, 1));
	System.out.println(mc7.곱하기(4, 2));
	System.out.println(mc7.나누기(4, 0));
	System.out.println(mc7.나머지구하기(2, 11));
	int a=2%11;
	System.out.println(a);
}
}
class my7{
	
	//더하기
	
	int 더하기(int num1,int num2) {
		int re=num1+num2;
				return re;
	}
	
	
	//뺴기
	int 빼기(int num1,int num2) {
		int re2=num1-num2;
				return re2;
	}
	
	//곱하기
	int 곱하기(int num1,int num2) {
		int re3=num1*num2;
				return re3;
	}
	

	//나누기(0으로 나누면 결과를 0으로)
	int 나누기(int num1,int num2) {
		int re4;
		if(num2==0) {
			re4=0;
		}
		else {
	        re4=num1/num2;
    	}
		
		return re4;
	}
	
	//%안쓰고 나머지 구하기 만들기
	
	int 나머지구하기(int num1,int num2) {
		int re5=0;
		re5=num1-(num2*(num1/num2));
		
		return re5;
	}
	
}