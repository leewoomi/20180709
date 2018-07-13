
public class Test2 {

	public static void main(String[] args) {
		/*
		 * 아래와 같은 모양을 출력
		 * ***3
		 * **2
		 * *1
		 * **2
		 * ***3
		 * ---------------
		 * 위에 안되면
		 * *********9
		 * *******7
		 * *****5
		 * ***3
		 * *1
		 * */
		
		for(int i=0; i<5; i++) {
			if(i<3) {
			for(int j=0; j<3-i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}else {
				for(int j=0; j<i-1; j++) {
					System.out.print("*");
					}
					System.out.println();
			}
		}
	
		

	}

}
