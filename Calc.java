package calcapp.main;
import calcapp.logics.*;
public class Calc{
	public static void main(String[] args){
		int a=10; int b =2;
		int total =CalcLogic.tasu(a,b);
		int delta =CalcLogic.hiku(a,b);
		//int a = Math.max(3,5);
		//int b Integer.parseInt("8");
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
