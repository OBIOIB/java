import java.util.*;
public class Method4{
	public static void main(String[] args){
		int n = sumOf(3,5);
		System.out.println(n);//8
		double area = squareArea(3.4,2.0);
		System.out.println(area);//6.8
		boolean b = isEven(10);
		System.out.println(b);//true
		char c = firstLetter("Java");
		System.out.println(c);//J
		String result =  timesword("Hello",3);
		System.out.println(result);//HelloHelloHello
	}
	/*メソッドは戻り値を設定することができる*/
	/*
	 * sumOfメソッド
	 * 引数で2つの整数を受け取りその合計を返す
	 * 引数:a(int) b(int)
	 * 戻り値:sum (int)2つの引数の和
	 */
	public static int sumOf(int a,int b){
		int sum = a + b;
		return sum;
	}
	/*
	 * squareAreaメソッド
	 * 幅と高さを受け取り、四角形の面積を返す
	 * 引数:width(double) height(double)
	 * 戻り値:面積(double)
	 */
	public static double squareArea(double width,double height){
		return width * height;
	}
	/*
	 * isEvenメソッド
	 * 引数で受け取った整数が偶数か銅貨をboolで返す
	 * 引数:x(int)
	 * 戻り値:偶数ならばtrue,奇数ならfalse(bool)
	 */
	public static boolean isEven(int x){
		return x % 2 ==0;
	}
	/*
	 * firstletterメソッド
	 * 引数で単語を受け取り、その一文字目を返す
	 * 引数:word(String)
	 * 戻り値:最初の1文字(char)
	 */
	public static char firstLetter(String word){
		return word.charAt(0);
	}
	/*
	 * timeswordメソッド
	 * 引数で単語と回数を受け取り、回数分単語を繰り返した文字列を返す
	 * 引数:word(String) times(int) 回数
	 * 戻り値回数分連結された文字列(String)
	 */
	public static String timesword(String word,int times){
		String str = "";
		for(int i=0;i<times;i++){
			str = str + word;
		}
		return str;
	}
}
