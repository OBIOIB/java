import java.util.*;
public class LeapYearApp{
	public static void main(String[] args){
		System.out.print("西暦と月を入力>>");
		String csv = new Scanner(System.in).nextLine();
		int[] dataArr=csvToIntArr(csv);
		int days=daysOfMonth(dataArr[0],dataArr[1]);
		System.out.printf("%d年%d月は%d日まであります%n",dataArr[0],dataArr[1],days);
	}
	public static int[] csvToIntArr(String csv){
		String[] data = csv.split(",");
		int[] retArr = new int[data.length];
		for(int i =0;i<retArr.length;i++){
			retArr[i]=Integer.parseInt(data[i]);
		}
		return retArr;
	}
	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public static int daysOfMonth(int year,int month){
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)){
			days[1]=29;
		}
		return days[month-1];
	}
}
