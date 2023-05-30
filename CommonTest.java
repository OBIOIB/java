import java.util.*;
import my.util.*;
public class CommonTest{
	public static void main(String[] args){
		int dice=Common.randRange(1,6);
		System.out.println(dice);
		int n = Common.intInput("要素数>>");
		int[] data = new int[n];
		for(int i =0;i<data.length;i++){
			data[i]=Common.randRange(0,100);
		}
		Arrays.sort(data);
		Common.arrReverse(data);
		System.out.println(Arrays.toString(data));
	}
}
