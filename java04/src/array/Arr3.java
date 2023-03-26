package array;

public class Arr3 {
public static void main(String[] args) {
	//음식점의 베뉴를 만들어보자(음식명-가격)
	String n[]= {"라면","김밥","순대","떡볶이","튀김"};
	int p[]=new int[5];
	
	p[0]=3000;
	p[1]=2000;
	p[2]=4000;
	p[3]=3000;
	p[4]=3500;  //5칸짜리 방에는 4번방까지 있음 / 0부터 4번
	
	//배열전체 출력(for문)
	for(int i=0; i<=n.length;i++) {
		System.out.println(n[i]+" : "+p[i]);
		}
}
}
