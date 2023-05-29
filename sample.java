import java.util.*;
public class sample{
	public static void main(String[] args){
		int n = new Random().nextInt(10)+1;
		int[] nums = new int[10];
		Random rand =new Random();
		int[] data = new int[19];
		for(int i =0;i<nums.length;i++){
			nums[i] = rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(nums));
		Scanner scan = new Scanner(System.in);
		System.out.print("数値>>");
		int x =scan.nextInt();
	}
}
