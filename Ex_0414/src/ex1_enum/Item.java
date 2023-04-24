package ex1_enum;

public enum Item {
	START("시작",0),STOP("멈춤",1),EIXT("종료",2);
	String itemStr;
	int sign;
	
	private Item(String str, int sign) {
		// TODO Auto-generated constructor stub
		this.itemStr=str;
		this.sign=sign;
	}
	
	
	public String getItemStr() {
		return itemStr;
	}
	
	public int getSign() {
		return sign;
	}
}
