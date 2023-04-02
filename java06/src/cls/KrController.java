package cls;

public class KrController {
public static void main(String[] args) {
	Kr A=new Kr();
	
	A.setNum(11);   //모델
	A.setSrt("안녕");
	
KrSer Ks=new KrSer();   //꾸며주기
	
	Ks.decoEquals(A);
	//Ks.decoplus(A);
	
	
	KrP Ap=new KrP();  //출력
	
	Ap.printnum(A);
	Ap.printstr(A);
	
	
}
}

//Kr 클래스 변수/num,str
class Kr{
	int num;
	String str;
	
	void setNum(int num) {
		this.num=num;
		
	}
	
	int getNum() {
		return num;
	}
	void setSrt(String str) {
		this.str=str;
		
	}
	String getStr() {
		return str;
	}
	
}
//Kr 클래스 입력용 num,str
class KrP{
	void printnum(Kr A) {
	System.out.println(A.num);
	}
	void printstr(Kr A) {
		System.out.println(A.str);
		}
	
}
//KrSer
class KrSer{
	
	//출력전 꾸며주기
	
	void decoEquals(Kr A) {
		A.setSrt("=="+A.getStr()+"==");
	}
	void decoplus(Kr A) {
		A.setSrt("+"+A.getStr()+"+");
	}
}
