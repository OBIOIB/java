import java.util.*;
public class primeNunmerchecker{
	public static void main(String[] args){
		if(args.length ==0){
			System.out.println("err:引数で正の整数をいれてください");
			return;
		}
		int num = Integer.parseInt(args[0]);
		boolean isPrime = true;
		if(num ==1){
			isPrime = false;
		}
		for(int i = 2;i<num;i++){
			if(num % i == 0){
				isPrime = false;
			}
		}
		//if(isPrime){
		if(isPrime ==true){
			System.out.println(num+"は素数です");
		}else{
			System.out.println(num+"は素数ではありません");
		}
	}
}
