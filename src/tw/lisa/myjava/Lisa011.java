package tw.lisa.myjava;

public class Lisa011 {//99乘法

	public static void main(String[] args) {
		for(int k=0;k<2;k++) {
			for(int j=1;j<=9;j++) {
				for (int i=2;i<6;i++) {
					int newi=i+k*4;
					int r=newi*j;
					System.out.printf("%d x %d= %d\t",newi,j,r);	
				}
				System.out.println();
			}	
			System.out.println("--------");
		}
		
	}

}
