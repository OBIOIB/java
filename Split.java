import java.util.*;
public class Split{
	public static void main(String[] args){
		String str ="りんご,みかん,ばなな";
		String[] data = str.split(",");
		System.out.println(Arrays.toString(data));
		str ="さるといぬときじ";
		data = str.split("と");
		System.out.println(Arrays.toString(data));
		str ="さるandいぬandきじ";
		data = str.split("and");
		System.out.println(Arrays.toString(data));
		str ="さる いぬ きじ";
		data = str.split(" ");
		System.out.println(Arrays.toString(data));
		str ="1,2,3,4,5";
		data = str.split(",");
		System.out.println(Arrays.toString(data));
		int[] nums = new int[data.length];
		for(int i=0;i<nums.length;i++){
			nums[i] = Integer.parseInt(data[i]);
		}
		System.out.println(Arrays.toString(nums));
		str ="りんご,みかん,ばなな";
		data = str.split(",",2);
		System.out.println(data[0]);//りんご
		System.out.println(data[1]);//みかん,ばなな
	}
}
