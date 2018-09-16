package day03;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价");
		double prices = scan.nextDouble();
		System.out.println("请输入数量");
		int number = scan.nextInt();
		System.out.println("请输入金额");
		double money = scan.nextDouble();
		System.out.println("应收金额为");
		double tatalprices=prices*number;
		if(tatalprices>=500) {
			tatalprices*=0.8;
		}
		if(tatalprices<=money) {
			double change=money-tatalprices;
			System.out.println("找零");
			System.out.println(change);
		}else {
			System.out.println("还差"+(tatalprices-money));	
		}
	
	}

}
