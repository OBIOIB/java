import java.util.*;
public class BmiApp{
	public static void main(String[] args){
		double bmi = calcBMI(170.0,71.2);
		System.out.printf("BMI:%.2f%n",bmi);
	}
	/*
	 * calcBMIメソッド
	 * 身長cmと体重kgからBMIを求めるメソッド
	 * 引数:heightCm(double)身長cm,weightKg(double)体重kg
	 * 戻り値:bmi(double)
	 */
	public static double calcBMI(double heightCm,double weightKg){
		//身長をcmからmに変換
		double heightM = heightCm/100;
		//bmiの算出(体重(kg) / 身長(m)の2乗
		double bmi = weightKg / (heightM * heightM);
		return bmi;
	}
}
