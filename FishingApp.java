import java.util.*;
public class FishingApp{
	public static void main(String[] args){
		//巻取量テーブル
		int[] LEN_ARR ={20,10,10,5,5,1};
		//ダメージテーブル
		int[] DAMAGE_ARR ={-1,0,0,0,1,1,1,1,1,1};
		//ダメージ表記
		String[] DAMAGE_MESSAGES ={"Great!!!","Good","Bad"};
		//残りの距離
		int length = 100;
		//現在のダメージ
		int damage = 2;

		//ランダムインスタンスの作成
		Random rand = new Random();
		//スキャナーインスタンスの作成
		Scanner sc = new Scanner(System.in);

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
			System.out.println("ダメージ"+damage+"/5");
		}
		//結果出力
		System.out.printf("%s%n",length ==0?"成功":"失敗");
	}
}
