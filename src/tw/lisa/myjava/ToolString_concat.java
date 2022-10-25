package tw.lisa.myjava;

public class ToolString_concat {

	public static void main(String[] args) {
		String s1="Hello Java !";
		System.out.println(s1.charAt(1));
		System.out.println("----------");
		
		//byte:二進制(由ASCII碼的字元可得美國標準資訊交換碼)
		
		byte []b1= {79,80,81,82,83};
		String s2=new String(b1);
		System.out.println(s2);
		System.out.println("----------");
		
		
		String s3=new String(b1,2,3);
		System.out.println(s3);
		System.out.println("----------");
		
		String s4=s3.concat("TUVWXYZ");
		System.out.println(s4);
		
	}

}
