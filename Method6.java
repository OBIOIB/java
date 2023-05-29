import java.util.*;
public class Method6{
	public static void main(String[] args){
		int ret = method(3);
		System.out.println(ret);
		ret = method(-5);
		System.out.println(ret);
		int most = method1(5,6,4);
		System.out.println(most);
		System.out.println(method2(5.0,7.0,9.0));
		System.out.println(method3("フィッシュ","竹中"));
		System.out.println(method4(8));
		if(method4(8)){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
		int[] arr ={1,2,3};
		method5(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 ={10,20,30};
		int[] retArr = method6(arr2);
		System.out.println(Arrays.toString(retArr));
	}
	public static int method(int n){
		return -n;
	}
	public static int method1(int n1,int n2,int n3){
		int max =n1;
		if(n2 > max){
			max =n2;
		}
		if(n3 > max){
			max =n3;
		}
		return max;
	}
	public static double method2(double n1,double n2,double n3){
  	return (n1 + n2 + n3) / 3;
	}
	public static String method3(String str1,String str2){
		return str1+str2;
	}
	public static boolean method4(int x){
		return x % 2 == 0;
	}
	public static void method5(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*2;
		}
	}
	public static int[] method6(int[] arr){
		int[] retArr = new int[arr.length];
		for(int i =0;i<retArr.length;i++){
			retArr[i] = arr[i]*2;
		}
		return retArr;
	}
}
