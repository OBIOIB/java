import java.util.*;
public class 5_24_5{
	public static void main(String[] args){
		int[] arr ={2,3,3,4};
		int[] retArr = evenArr(arr);
			System.out.println(Arrays.toString(retArr));
	}
	static int[] evenArr(int[] arr){
		int count=0;
		for(int n : arr){
			if(n % 2 == 0){
				count++;
			}
	}
	int[] retArr = new int[count]{
		int idx =0;
		for(int n : arr){
			if(n % 2 ==0){
				retArr[idx]=n;
				idx++;
			}
		}
		return retArr;
	}
}
