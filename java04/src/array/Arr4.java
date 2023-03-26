package array;

import java.util.Scanner;

public class Arr4 {
public static void main(String[] args) {
	//국가와 수도 5개
//	대한민국의 수도는 도쿄
//	중국의 수도는 베이징
//	미국의 수도는 워싱턴
//	러시아의 수도는 모스크바
	String n[]= {"대한민국","중국","미국","러시아"};
	String c[]= {"서울", "베이징","워싱턴","모스크바"};
	
	for(int a=0; a<n.length; a++) {
		System.out.println(n[a]+"의 수도는 "+c[a]+"입니다");
	}
	
//	String str = "hi";
//	String str2 = "hi";
//	if (str == str2) {
//		System.out.println("같지!");
//	}
	
	//사용자 입력으로 국가를 받아서 해당 국가의 수도를 알려주는 프로그램 만들기
	
	System.out.println("국가를 입력해주세요>>");
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	int xx=-1;
	

	for(int x=0;x<n.length;++x) {
		if(s.equals(n[x])) {
			xx=x;
			//break;
		}
		
	}
	if(xx>=0&&xx<=n.length) {
		System.out.println(s+"의 수도는 "+c[xx]+"입니다.");
	}
	else {
	
	System.out.println(s+": 일치하는 국가가 없습니다.");}
	

	

//	if(xx==-1) {
//		System.out.println("일치하는 결과가 없습니다");
//	}
//	else {
//		System.out.println(n[xx]+"의 수도는 "+c[xx]+"입니다.");
//	}

	
}
}
