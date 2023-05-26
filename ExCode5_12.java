public class ExCode5_12{
	public static void main(String[] args){
		int n = 5;
		methodA(n);
		System.out.println(n);
		int[] arr ={1,2,3};
		methodB(arr);
		System.out.println(java.util.Arrays.toString(arr));
	}
	public static void methodA(int n){
		n*=100;
		System.out.println(n);
	}
	public static void methodB(int[] arr){
		arr[0] *= 100;
		System.out.println(java.util.Arrays.toString(arr));
	}
}
