import java.util.*;
public class IntroductionApp{
	public static void main(String[] args){
		String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
		String[] races={"人間","ハイエルフ","トロル","ノーム"};
		String[] classes={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceMatrix={
			{10,10,10,10,10},
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] classMatrix={
			{1.6,1,1.4,1,1},
			{1.1,1,1.2,1.3,1.3},
			{1.3,1.5,1.1,1,1},
			{1,1.9,1,1,1.1},
		};
		Scanner sc= new Scanner(System.in);
		System.out.print("名前を入力してください>>");
		String name = sc.nextLine();
		int seed = calcSeed(name);
		int[] maxArr={100,100,50,50,50};
		int[] status = makeStatus(seed,maxArr);
		System.out.println("初期ステータスが決定しました");
		showStatus(status,params);
		System.out.printf("種族を選んでください%s>",arrToString(races));
		int race = sc.nextInt();
		System.out.println(races[race]+"のボーナスが適用されました!");
		raceBonus(status,raceMatrix[race]);
		showStatus(status,params);
		System.out.printf("職業を選んでください%s>",arrToString(classes));
		int cls = sc.nextInt();
		System.out.println(classes[cls]+"のボーナスが適用されました!");
		classBonus(status,classMatrix[cls]);
		showStatus(status,params);
		System.out.println("***作成成功!***");
		System.out.printf("私は%sの%s、%sです。%n",classes[cls],races[race],name);
		System.out.println("能力値(" + sumStatus(status)+")を高い順に並べると");
		sortStatus(status,params);
		for(int i =0;i<status.length;i++){
			System.out.printf("%s:%d%n",params[i],status[i]);
		}
		System.out.println("です。今後ともよろしく...");
	}
	static int calcSeed(String name){
		//seed(種)
		int seed = 0;
		//名前の文字数分回るループ
		for(int i =0;i<name.length();i++){
			//一文字づつ取り出しながらseedに加算
			seed += name.charAt(i);
		}
		return seed;
	}
	static int[] makeStatus(int seed,int[] maxArr){
		int[] vals =new int[maxArr.length];
		Random rand = new Random(seed);
		for(int i =0;i<vals.length;i++){
			vals[i] = rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}
	static void raceBonus(int[] status,int[] bonus){
		for(int i=0;i<status.length;i++){
			status[i] += bonus[i];
		}
	}
	static void classBonus(int[] status,double[] ratio){
		for(int i=0;i<status.length;i++){
			status[i] =(int)(status[i]*ratio[i]);
		}
	}
	static int sumStatus(int[] status){
		int sum = 0;
		for(int n:status){
			sum += n;
		}
		return sum;
	}
	static void showStatus(int[] status,String[] params){
		String str = "";
		for(int i=0;i<status.length;i++){
			str += params[i] + ":" +status[i]+" ";
		}
		System.out.println("[" + str + "]");
	}
	static String arrToString(String[] arr){
		String str = "";
		for(int i=0;i<arr.length;i++){
			//str += i + "..." +arr[i]+",";
			str += String.format("%d...%s>",i,arr[i]);
		}
		//最後の,削除
		str = str.substring(0,str.length()-1);
		return str;
	}
	static void sortStatus(int[] status,String[] Params){
		for(int i =0;i<status.length-1;i++){
			for(int j=i+1;j<status.length;j++){
				if(status[i] < status[j]){
					int t1 = status[i];
					status[i]=status[j];
					status[j]=t1;
					String t2 = Params[i];
					Params[i] = Params[j];
					Params[j] = t2;
				}
			}
		}
	}
}
