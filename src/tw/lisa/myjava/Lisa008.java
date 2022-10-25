package tw.lisa.myjava;

public class Lisa008 {

	public static void main(String[] args) {
		//假設書錢的價格位於0~300
		int bookfees=(int)(Math.random()*301);
		System.out.println(bookfees);
		if(bookfees>=250) {
			System.out.println("not buy!");
		}else {
			System.out.println("buy it!");
		}
	}

}
