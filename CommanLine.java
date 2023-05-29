public class CommanLine{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("引数はありません");
		}else{
			for(String name:args){
				System.out.println(name);
			}
		}
	}
}
