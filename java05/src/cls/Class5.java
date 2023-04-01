package cls;

public class Class5 {
public static void main(String[] args) {
	my9 m1=new my9();
	m1.setVar(3, 4, "안녕", 3.14);
	
	
	my9 m2=new my9();
	m2.num1=11;
	m2.num2=11;
	m2.str="애옹";
	m2.dnum=11.3;
	
	m1.정보보기();
	m2.정보보기();
	
	
}
}
class my9{
	int num1;
	int num2;
	String str;
	double dnum;
	
void 정보보기() {
	System.out.println(""+num1+num2+str+dnum);
}
	
	void setVar(int num1,int num2,String str,double dnum) {
		int var=0;//지역변수나 매개변수는 함수가 실행된 후 삭제됨
		this.num1=num1;
		this.num2=num2;
		this.str=str;
		this.dnum=dnum;
		
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	
}