package condition;

public class Ifelse2 {
public static void main(String[] args) {
	int num=99;
	
	//10보다 작은지, 100보다 작은지, 100보다 작은지, 1000이상인지
	if(num<10) {
		System.out.println("10보다 작음");
	}
	if(num<100) {
		System.out.println("100보다 작음");
	}
	if(num<1000) {
		System.out.println("1000보다 작음");
	}
	else {
		System.out.println("1000이상");
	}
	//따로
	
	
	System.out.println("-----------------");
	
	//같이
	if(num<10) {
		System.out.println("10보다 작음");
	}
	else if(num<100) {
		System.out.println("100보다 작음");
	}
	else if(num<1000) {
		System.out.println("1000보다 작음");
	}
	else {
		System.out.println("1000이상");
		
	}
	
	
	System.out.println("-----------------");
	
	
	if(num<10) {
		System.out.println("10보다 작음");
	}
	if(num>=10&& num<100) {
		System.out.println("10이상이고 100보다 작음");
	}
	if(num>=100&& num<1000) {
		System.out.println("100이상이고 1000보다 작음");
	}
}
}
