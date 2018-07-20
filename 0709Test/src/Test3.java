
public class Test3 {

	public static void main(String[] args) {
					/*
					 * 0
					  1 2 
					 3   4 
					5     6 
				   7       8 
				  90123456789
					 */
			
		int idx =0;
		for(int i=0; i<6; i++) {
			int j;
			for(j=0; j<=5-i;j++) {
				System.out.print(" ");
			}System.out.print(idx % 10);
			idx +=1;
			if (i>=1 && i <=4) {
				for(j=0;j<2*i-1;j++) {
					System.out.print(" ");
				}
				System.out.print(idx % 10);
				idx += 1;
			}
			if(i==5) {
				for(j=0;j<2*i;j++) {
					System.out.print(idx % 10);
					idx +=1;
				}
			}
			System.out.println(" ");
		}
			
	}

}
