package tw.lisa.myjava;

import javax.lang.model.element.Element;

public class ToolArray {

	public static void main(String[] args) {
		/*Array(陣列)
		 * 可聲明一數組變量，如 numbers[100] 來代替直接聲明 100 個獨立變量 number0，number1，....，number99。
		 * 可創建在記憶體中創出新int空間
		 */
		
		
		
		int [] a=new int[3];
		/*可寫成 int size=3;
		 * int[] a=new int [size];
		 * 此時a已完成初始化，在a的記憶體中增加3個空間!
		 */
		
		System.out.println("Before a:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("---------");
		
		
		
	//更換元素	
		a[1]=30;a[2]=15;
		System.out.println("After a:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("---------");
		
		
		
	//  打印所有數組元素
		double [] b= {3.2,4.3,5.7,9.8};
		System.out.println("b:");
		for(int t=0;t<b.length;t++) {
			System.out.println(b[t]);
		}
		System.out.println("----------");
		
		
		
    //  計算所有元素的總和
		double total =0;
		for(int t=0;t<b.length;t++) {
			total+=b[t];
		}
		System.out.println("b的總和是"+total);
		System.out.println("。。。。。。。。\n");
		
		
		
		
	//  可以使用for-each做訪問
		System.out.println("a的元素有: ");
		for(int Element:a) {
			System.out.println(Element);
		}
		System.out.println("------------");
		
		
		System.out.println("b的元素有: ");
		for(double Element :b) {
			System.out.println(Element);
		}
		System.out.println("--------------\n");
		
		
		
		
		
	/* 多維數組
	 * 多維數組可看成是數組的數組
	 * 如二維數組就是一個特殊的一維數組
	 * 每一元素都是一個一維數組
	 * 透過多為數組的方式，可分別為每一維分配新的空間、數值
	 */
		
		//x在二維數組裡，在0的記憶體位置新增了1個位置
		//在1的記憶體位置新增了3個位置
		int [][]x=new int[2][];
		x[0]=new int[1];
		x[1]=new int[3];
		
		x[0][0]=33;
		x[1][1]=22;
		x[1][2]=17;

		
		//叫出記憶體位置
		for(int []v:x) {
			System.out.println(v);
		}
		
		System.out.println("----------");
		
		
		
		//叫出在x[1][]中的值
		for(int i=0;i<x[1].length;i++) {
			System.out.print(x[1][i]+" ");
		}
		System.out.println("\n");
		System.out.println("----------");
		
		
		
		//叫出在x[0][]的值，但用for-each方式
		for(int n:x[0]) {
			System.out.println(n);
		}
		
		System.out.println("----------");
		
		
		
		//叫出所有的值，用for-each方式
		for(int []m:x) {
			for(int mm:m) {
				System.out.print(mm+" ");
			}System.out.println();
			
			
		}
	}

}
