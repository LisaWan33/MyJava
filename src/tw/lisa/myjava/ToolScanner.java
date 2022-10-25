package tw.lisa.myjava;

import java.util.Scanner;

public class ToolScanner {
	//練習:008,009,010

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//從鍵盤接收數據 
		System.out.println("year:");
		int year=scanner.nextInt();
		//可以INT,DOUBLE,...
		// nextLine方式接收字符串
		
		
		if(year % 400==0||(year % 4==0 && year % 100!=0)) {
			System.out.println(year+"是閏年");
		}else {
			System.out.println(year+"是平年");
		}

	}

}
