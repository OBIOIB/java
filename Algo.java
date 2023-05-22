import java.util.*;
public class Algo{
	public static void main(String[]nargs){
		int[] arr = {3,5,1,4,8,};
		//reverse(逆順にする)
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]= temp;
		}
		System.out.println(Arrays.toString(arr));
		//sort(昇順に並び替え)
		for(int i =0;i<arr.length-1;i++){
			for(int j =i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//shuffle(シャッフル)
		for(int i =0;i<arr.length-1;i++){
			int idx = new Random().nextInt(arr.length-i)+i;
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;

		}
		System.out.println(Arrays.toString(arr));

		//LinearSearch(線形サーチ)
		//配列に7が含まれているかの例
		int i=0;
		for(;i<arr.length;i++){
			if(arr[i] == 7){
				break;
			}
		}
		if(i == arr.length){
			System.out.printf("含まれていない");
		}else{
			System.out.printf("含まれている");
	}

}
