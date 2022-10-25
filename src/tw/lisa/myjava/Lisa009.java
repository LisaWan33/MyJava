package tw.lisa.myjava;

import java.util.Scanner;

public class Lisa009 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("temperature: ");
		double temperature=scanner.nextDouble();
		
		if(temperature>=28.0) {
			System.out.println("hot");
		}else {
			if(temperature>=25.0) {
				System.out.println("comfortble");
			}else {
				System.out.println("cold");
			}
		}
	
	}

}
