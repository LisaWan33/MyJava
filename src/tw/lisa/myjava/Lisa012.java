package tw.lisa.myjava;

import java.util.HashSet;
import java.util.TreeSet;

public class Lisa012 {

	public static void main(String[] args) {
	//隨機求取數字1~100顆球，從100顆球中篩出3顆球
		TreeSet<Integer> balls=new TreeSet<Integer>();
		while(balls.size()<3) {
			balls.add((int)(Math.random()*101));
			
		}System.out.println(balls);
	
	}

}
