package tw.lisa.myjava;

public class Lisa017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String regex="09\\d{8}|0\\d{2,3}\\s?\\d{7,8}|0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4}";
		String regex="0\\d{2,3}\\s?\\d{7,8}|(0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4})";

		String tel="0909068601";//行動電話
		String tel2="080029012";
		String tel1="09090236";
		
		String t1="037-481876";//苗栗
		String t2="05532-3237";//雲林
		String t3="08250-5555";//金門
		String t4="049500-7654";//南投
		
		String t5="04500-540";
		
		boolean flag=tel2.matches(regex);
		if(flag) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
//		0\\d{2,3}[-]?\\d{7,8}|
	}

}
