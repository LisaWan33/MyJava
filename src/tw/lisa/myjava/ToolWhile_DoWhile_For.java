package tw.lisa.myjava;

public class ToolWhile_DoWhile_For {

	public static void main(String[] args) {
		
		/* 順序結構的程序語句只能被執行一次。
		 * 想要同樣的操作執行多次，就需要使用循環結構。
		 * Java中有三種主要的循環結構：
		 * while循環、do…while循環、for-loop循環、Java 中增強的 For 循環(For-Each 循環)
		 */
		
		
		//While循環: 只要布爾表達式為true，循環就會一直執行下去。
		int x=10;
		while(x<20) {
			System.out.println("value of x: "+ x);
			x++;
		}
		
		System.out.println("-----------------");
		
		/*do…while 循環:對於while 語句而言，如果不滿足條件，則不能進入循環。
		 *但有時候我們需要即使不滿足條件，也至少執行一次。
		 *do…while 循環和while 循環相似，不同的是，do…while 循環至少會執行一次。
		 * 
		 */
		int x1=14;
		do {
			System.out.println("value of x1: "+ x1);
			x1++;
		}while(x1<20);
		
		System.out.println("-----------------");
		
		/* for 循環:雖然所有循環結構都可以用while 或者do...while表示。
		 * 但Java 提供了另一種語句—— for 循環，使一些循環結構變得更加簡單。
		 * for循環執行的次數是在執行前就確定的。
		 * 
		 */
		for(int x2=16;x2<20;x2++) {
			System.out.println("value of x2: "+ x2);
		}
		
		System.out.println("-----------------");
		
		/*Java 增强 for 循环
		 * => foreach循环
		 * 聲明語句：聲明新的局部變量，該變量的類型必須和數組元素的類型匹配。其作用域限定在循環語句塊，其值與此時數組元素的值相等。
		 * 表達式：表達式是要訪問的數組名，或者是返回值為數組的方法。
		 */
		int[]nums={1,2,3,4,5,6,7};
		for(int i:nums) {
			System.out.print(i);System.out.print(",");
		}
		String [] names= {"Tonny","Fred","Brad","Jack","Mello"};
		for(String a :names) {
			System.out.print(a);System.out.print(",");
		}
		
	}

}
