package tw.lisa.myjava;

import java.util.HashSet;

public class Lisa013 {

	public static void main(String[] args) {
		//從數字3~1003瓶飲料中，篩出一瓶數字飲料
		HashSet<Integer> bottles=new HashSet<>();
		while(bottles.size()<1) {
			bottles.add((int)(Math.random()*1000+3));
		}System.out.println(bottles);
	
	}

}
