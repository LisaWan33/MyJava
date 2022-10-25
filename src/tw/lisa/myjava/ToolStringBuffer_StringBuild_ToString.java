package tw.lisa.myjava;

public class ToolStringBuffer_StringBuild_ToString {

	public static void main(String[] args) {
		/* toString():         返回表示Integer 值的String 對象。
		 * toString(int i):    返回表示指定int 的String 對象。
		 * toString 總共有上述兩種表示方法。
		 * i : 要轉換的整數(參數); toString:返回值
		 */
	Integer x=5;
	System.out.println(x.toString(x));
	
	System.out.println(Integer.toString(12));
	
	

	/*StringBuffer、StringBuild
	 
	 * 在使用StringBuffer 類時，每次都會對StringBuffer 對象本身進行操作，
	   而不是生成新的對象，所以"如果需要對字符串進行修改推薦使用StringBuffer"。
	 * StringBuilder 類在Java 5 中被提出，它和StringBuffer 之間的最大不同在於
	   StringBuilder 的方法不是線程安全的（不能同步訪問）。
	 * 由於StringBuilder 相較StringBuffer" 有速度優勢，所以多數情況下建議使用
	   StringBuilder 類"。
	   
	   
	 * StringBuffer 類支持的主要方法：
	   1. public StringBuffer append(String s)>>>  將指定的字符串追加到此字符序列。
	   2. public StringBuffer reverse()>>>  將此字符序列用其反轉形式取代。
	   3. public delete(int start, int end)>>>  移除此序列的子字符串中的字符。
	   4. public insert(int offset, int i)>>>  將 int 參數的字符串表示形式插入此序列中。
	   5. insert(int offset, String str)>>> 將 str 參數的字符串插入此序列中。
	   6. replace(int start, int end, String str)>>>  使用給定 String 中的字符替換此序列的子字符串中的字符。
	 * StringBuffer 類的其他常用方法:
	   https://www.runoob.com/java/java-stringbuffer.html
	 */
	
	
	StringBuffer sb= new StringBuffer("Lisa: ");
	sb.append("www.LISA" );
	sb.append(".com");
	sb.append(".tw");
	System.out.println(sb);
	}

}
