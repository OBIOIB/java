public class Method3{
	public static void main(String[] args){
		hello("山田");
		hello("田中");
		hello("佐藤");
		add(3,5);
		add(10,20);
		add(100,500);
		timesword("Hello",3);
		timesword("Peace",5);
		timesword("Happy",10);
	}
	/* メソッドじゃ引数を設定することができる*/
	/*helloメソッド
		引数:name
		*/
	public static void hello(String name){
		System.out.println(name + "さん、こんにちは!");
	}

	//引数はカンマ区切りで複数設定することができる
	/*addメソッド
	  2つの引数の和を出力する
	  引数:x(int),y:(int)
	  */
	public static void add(int x,int y){
		System.out.printf("%dと%dの和は%dです%n",x,y,x+y);
	}

	/*timeswordメソッド
	 * 引数で入ってきた単語を指定回数分繰り返し出力する
	 * 引数:word(String) count(int) 回数*/
	public static void timesword(String word,int count){
		for(int i=0;i<count;i++){
			System.out.print(word);
		}
		System.out.println();
	}
}
