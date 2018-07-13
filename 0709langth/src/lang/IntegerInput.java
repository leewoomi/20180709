package lang;

import java.util.Scanner;

public class IntegerInput {

	public static void main(String[] args) {
	
		int a =-1;
		//double a =1.0; 
		String str;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력해주세요.");
			try {
			str = sc.nextLine();
			a =Integer.parseInt(str);
			//a= Double.parseDouble(str);
			
		break;
			}catch(Exception e) {
				System.out.println("정수를 입력하세요");
			}
		}
		System.out.println(a);
		sc.close();

	}

}
