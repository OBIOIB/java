import java.util.*;
public class Method5{
	public static void main(String[] args){
		int n1 = sumOf(5,10);
		System.out.println(n1);//15
		int n2 = sumOf(2,4,6);
		System.out.println(n2);//12
		int [] nums ={1,2,3};
		int n3 =sumOf(nums);
		System.out.println(n3);//6
	}
	/*メソッドはオーバーロード(Overload)できる*/
	public static int sumOf(int a,int b){
		return a+b;
	}
	public static int sumOf(int a,int b,int c){
		return a+b+c;
	}
	public static int sumOf(int[] arr){
		int sum =0;
		for(int n:arr){
			sum += n;
		}
		return sum;
	}
	/*以下はコンパイルエラー
	public static int sumOf(int x,int y){
		return x+y;
	}
	public static void sumOf(int a,int b){
		System.out.println("和は"+(a+b));
	}
		*/
}
