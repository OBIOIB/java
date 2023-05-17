public class Method2 {
	public static void main(String[] args) {
		System.out.println("★カレーを作るよ★");
		preCook();
		mainCook();
		System.out.println("★カレーが出来ました★");
	}
	public static void preCook(){
		System.out.println("材料を揃える");
		System.out.println("野菜を切る");
		System.out.println("肉を切る");
	}
	public static void mainCook(){
		System.out.println("食材を炒める");
		System.out.println("ルーを加え煮込む");
	}
}
