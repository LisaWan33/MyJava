package tw.lisa.myjava;

import java.util.Scanner;

public class ToolSwitch {

	public static void main(String[] args) {
		
		/*switch括號中，置放所需取出的變數
		 * 取得數值後，程式會與case中所設定的數字、字元比較
		 *  若符合，就執行以下陳述句，直到遇見break，離開switch區塊;
		 *  若沒有符合，則執行default後的陳述句，但這不一定需要，可以省略
		 */
		 
		 
		Scanner scanner =new Scanner(System.in);
		System.out.println("請輸入1~10的數字，判定是否是基數，或是偶數:");
		int nums=scanner.nextInt();
		switch(nums){
		case 1,3,5,7,9:
			System.out.println("是基數");
		break;
		
		case 2,4,6,8:
			System.out.println("是偶數");
		break;
		
		default:
			System.out.println("輸錯了喔!");
		
		
		}
	}

}
