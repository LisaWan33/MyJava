package tw.lisa.myjava;


public class Lisa014 {

	public static void main(String[] args) {
		int x1,x2,x3;
		x1=x2=x3=0;
		
		for(int i=1;i<101;i++) {
			int x=(int)((Math.random()*3)+1);
			
		switch(x) {
		case 1:x1++;break;
		case 2:x2++;break;
		case 3:x3++;break;	
		
		}
			}
		System.out.printf("%d點，出現了%d次\n",1,x1); 
		System.out.printf("%d點，出現了%d次\n",2,x2); 
		System.out.printf("%d點，出現了%d次\n",3,x3);
		
		System.out.println("------");
		System.out.printf("總共%d次",x1+x2+x3);

	}

}
