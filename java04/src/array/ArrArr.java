package array;

public class ArrArr {
public static void main(String[] args) {
	//2차원 배열
	//배열을 전체 사용하려면반복문을 사용
	//2타 배열을 전체 사용하려면 이중 반복문 사용
	
	int s_arr[][]= {{10,20},{100,200}};
	for(int i=0; i<s_arr.length;++i) {
		for(int j=0; j<s_arr[i].length;++i) {
			System.out.println(s_arr[i][j]);
		}
	}
	System.out.println(s_arr[0][1]); //20
	
	System.out.println(s_arr[1][0]); //200
}
}
