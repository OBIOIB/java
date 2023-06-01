import java.util.*;
public class welcome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("年齢>>");
		//nextIntの次にnextLineをする際は一度nextLineで空読みしておく
		int age = sc.nextInt();sc.nextLine();
		System.out.print("名前>>");
		String name = sc.nextLine();
		System.out.printf("ようこそ%s(%d)!%n",name,age);
	}
}
