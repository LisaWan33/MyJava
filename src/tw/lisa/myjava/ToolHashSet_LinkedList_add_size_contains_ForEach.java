package tw.lisa.myjava;

import java.util.HashSet;
import java.util.LinkedList;

public class ToolHashSet_LinkedList_add_size_contains_ForEach {
	
	
	
	
	/*HashSet 允許有null 值。
	 * HashSet 是無序的
	 * HashSet 中的元素實際上是對象，一些常見的基本類型可以使用它的包裝類。
	 * 重複的元素不會被添加
	 * 可以使用contains() 方法來判斷元素是否存在於集合當中
	 * 要計算HashSet 中的元素數量可以使用size() 方法
	 * 可以使用for-each(尋訪) 來迭代HashSet 中的元素。
	 */
	public static void main(String[] args) {
		HashSet<String> sites =new HashSet<String>();
		sites.add("It's");
		sites.add("Lisa");
		sites.add("here");
		sites.add("!");
		sites.add("Lisa");
		System.out.println(sites);
		
		sites.add("pretty");
		System.out.println(sites.contains("pretty"));
		
		System.out.println(sites.size());
		
		System.out.println("------");
		//For-Each
		for(String i: sites) {
			System.out.println(i);
		}
		System.out.println("------");	
			
	    /*比對使用LinkedList
	     * 以下情況使用 ArrayList :
			頻繁訪問列表中的某一個元素。
			只需在列表尾添加和刪除元素操作。
			
			以下情況使用 LinkedList :
			你需要通過循環迭代訪問列表中的某些元素。
			需要頻繁在列表中開頭、中間、末尾等位置添加、刪除元素操作。
	     */
		
			LinkedList<String>list=new LinkedList<>();
			list.add(0,"我");
			list.add(1,"是");
			list.add(2,"愛");
			list.add(3,"你");
			list.add(4,"的");
			System.out.println(list.size());
			System.out.println(list);
			System.out.println("。。。。。。。。。。");
			for(String v:list) {
				System.out.println(v);
			}
			
			list.add(1, "和");
			list.add(2, "他");
			System.out.println(list);
			System.out.println("。。。。。。。。。。");
			for(String v:list) {
				System.out.println(v);
			}
}
}
