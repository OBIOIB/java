import java.util.*;
public class FishingApp{
	public static void main(String[] args){
		//巻取量テーブル
		final int[] LEN_ARR ={20,10,10,5,5,1};
		//ダメージテーブル
		final int[] DAMAGE_ARR ={-1,0,0,0,1,1,1,1,1,1};
		//ダメージ表記
		String[] DAMAGE_MESSAGES ={"Great!!!","Good","Bad"};
		//スタート時の長さ
		final int START_LENGTH = 100;
		//スタート時のダメージ
		final int START_DAMAGE = 2;
		//maxダメージ
		final int MAX_DAMAGE = 5;

		//ランダムインスタンスの作成
		final Random rand = new Random();
		//スキャナーインスタンスの作成
		final Scanner sc = new Scanner(System.in);

		//残りの距離
		int length = START_LENGTH;
		//現在のダメージ
		int damage = START_DAMAGE;

		//初期表示
		System.out.println("釣りゲーム");
		System.out.println("Press enter Key...");

		//残りの長さが0より大きくかつダメージが5より大きい間継続するループ
		while(length > 0 && damage < 5){
			//sエンターキーで進む処理
			sc.nextLine();
			//巻取量の抽選
			int len = LEN_ARR[rand.nextInt(LEN_ARR.length)];
			//ダメージの抽選
			int dmg = DAMAGE_ARR[rand.nextInt(DAMAGE_ARR.length)];
			//出力
			System.out.println(len + "m!");
			System.out.println(DAMAGE_MESSAGES[dmg+1]);
			//長さの更新(0未満にはならない)
			length = Math.max(length-len,0);
			//ダメージの更新(0未満にはならない)
			damage = Math.max(damage+dmg,0);
			//出力
			System.out.println("残り"+length+"m");
			System.out.println("ダメージ"+damage+"/"+MAX_DAMAGE);
		}
		//結果出力
		System.out.printf("%s%n",length ==0?"成功":"失敗");
		sc.close();
	}
}
