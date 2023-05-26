import java.util.*;
public class exsample{
	public static void main(String[] args){
		System.out.print("何人>> ");
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		Random rand =new Random();
		int[] nums = new int[x];
		for(int i =0;i<nums.length;i++){
			nums[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(nums));
	}
}
