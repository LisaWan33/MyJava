package tw.lisa.myjava;

import java.util.HashSet;

public class Lisa016 {

	public static void main(String[] args) {
		
		//可以使用HashSet，也可以使用TreeSet
		HashSet<Integer>lotters= new HashSet<>();
		while(lotters.size()<6) {
			lotters.add((int)(Math.random()*49+1));
		} System.out.println(lotters);
	}

}
