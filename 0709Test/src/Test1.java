import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 금액을 입력받아서 오만원, 만원 짜리를 몇 장 주어야 하는지 계산하는 프로그램 작성 ex) 금액 : 260000 입력 결과 : 5만원 5장
		 * 만원 1장 출력
		 * 
		 *
		 */

		System.out.println("금액을 입력하세요.");

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = m / 50000;
		int k = (m % 50000) / 10000;
		System.out.printf("5만원: %d장, 만원: %d장", n, k);

	}

}
