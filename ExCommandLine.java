public class ExCommandLine{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("引数はありません");
		}else{
			int sum =0;
			for(String s : args){
				System.out.print(s + " ");
				sum += Integer.parseInt(s);
			}
			System.out.println("引数の合計は"+sum);
		}
	}
}
