package tw.lisa.myjava;

public class Lisa017 {

	public static void main(String[] args) {
		
//		String regex="09\\d{8}|0\\d{2,3}\\s?\\d{7,8}|0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4}";//tel1、2可以
		
//		String regex="[0][9][0-9]{8}|0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4}";//tel1、2可以

//		String regex="[0][9][0-9]{8}"+"0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4}";   //tel2可以、t3不行

//		String regex="^0\\d{1,2}[-]?\\d{6}$|^0\\d{4,5}[-]?\\d{4}$";//市話可以、tel、 1、2可以
		
//		String regex="[0][9][0-9]{8}";//只有tel成功

		
		
		//v1版本		
		String regex="[0][24]{1}[-][0-9]{8}|"
					+ "[0][3-8]{1}[-][0-9]{7}|"
					+ "[0][0-9]{2}[-][0-9]{7}|"
					+ "[0][0-9]{2}[-][0-9]{6}|"
					+ "[0][0-9]{3}[-][0-9]{5}|"
					+ "[0][9][0-9]{8}";
		
		String tel="0909066601";//行動電話(10位數)  
		
		String t1="02-55555555";
		//台北(02)、台中(04)、(2+8)
		String t2="03-6000000";
		//桃園、新竹、花蓮、宜蘭(03)、彰化(04)、
		//雲林、嘉義(05)、台南、澎湖(06)、高雄(07)、屏東(08)(2+7)
		String t3="049-2666666";
		//南投(3+7)
		String t4="037-481576";
		//苗栗(037)、台東(089)、金門(082)(3+6)
		String t5="0836-27654";
		//馬祖(4+5)
		
		String test="05-12345678";//xx
		String test1="080029012";//xx(長度9，但應符合10)
		boolean flag=test.matches(regex);
		if(flag) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
//////////////////////////////////////////////////		
		
		//V2版本<會有錯誤>
		String regex1="[0][0-9]{9}|"
				+ "[0][0-9]{8}|"
				+ "[0][9][0-9]{8}";
		
		
		String tel1="0909068601";//行動電話(10位數)
		String test3="080029012";
		String test4="09090236";//有bug!!!
		
		String t01="0255555555";
		//台北(02)、台中(04)、(2+8)
		String t02="036000000";
		//桃園、新竹、花蓮、宜蘭(03)、彰化(04)、雲林、嘉義(05)、台南、澎湖(06)、高雄(07)、屏東(08)(2+7)
		String t03="0492666666";
		//南投(3+7)
		String t04="037481876";
		//苗栗(037)、台東(089)、金門(082)(3+6)
		String t05="083627654";
		//馬祖(4+5)
		
		String test5="04500540";
		
//		boolean flag1=test4.matches(regex1);
//		if(flag) {
//			System.out.println("ok");
//		}else {
//			System.out.println("xx");
//		}
//		
	}

}
