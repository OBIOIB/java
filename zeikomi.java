import java.util.*;
public class zeikomi{
	public static void main(String[] args){
		System.out.print("税抜価格>>");
		int price = new Scanner(System.in).nextInt();
		System.out.print("税率>>");
		int tax = new Scanner(System.in).nextInt();
		int taxprice=calcPrice(price,tax);
		System.out.printf("税込価格は%d円です%n",taxprice);
	}
	/*
	 * calcPriceメソッド
	 * 税抜き価格と、消費税率から税込み価格鵜を求める
	 * 引数:print(int)税抜き価格,taxratio(int)税率
	 * 戻り値:税込み価格(int)
	 */
	public static int calcPrice(int price,int taxRatio){
		price = (int)(price * (1+taxRatio/100.0));
		return price; 
	}
}
