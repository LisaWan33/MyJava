package tw.lisa.myjava;

public class Lisa010 {

	public static void main(String[] args) {
		double temperature=(double)(Math.random()*101);
				System.out.println(temperature);
		
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
