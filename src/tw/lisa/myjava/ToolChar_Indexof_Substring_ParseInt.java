package tw.lisa.myjava;

public class ToolChar_Indexof_Substring_ParseInt {

	public static void main(String[] args) {
		String c1="apple";
		char s1=c1.charAt(1);  //charAt():傳回第一個字
		System.out.println(s1);
		System.out.println("------");
		
		int s2=c1.indexOf(s1);//indexOf():傳回所在位置
		System.out.println(s2);
		System.out.println("------");
		
		String c2="34567";
		String c3=c2.substring(1, 2);//substring(,):擷取字串的範圍
		System.out.println(c3);
		System.out.println("------");
		
		
		
		int n1=Integer.parseInt( c3);//Integer.parseInt():擷取字串範圍後，再轉換為數值
		System.out.println(n1);
		//=>等同於
		int n2=Integer.parseInt(c2.substring(2, 3));
		System.out.println(n2);
		
		int n3=Integer.parseInt(c2.substring(4, 5));
		System.out.println(n3);
		
	}

}
