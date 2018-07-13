package lang;

public class Main {

	public static void main(String[] args) {
		// value 형 변수 생성
		int n = 10;
		// value 형의 데이터를 대입
		int m = n;

		m = 20;

		System.out.println(n);

		// 참조형 데이터의 복사 - 주소가 복사

		int[] arr = { 10, 20, 30 };
		// 10,20,30이 저장된 곳의 주소를 복사
		int[] br = arr;
		// 복사된 주소의 첫번째 데이터를 1000으로 변경
		br[0] = 1000;
		System.out.println(arr[0]);

		// 참조형을 복사해 줄 때 실제 데이터를 복사해주기
		// 배열 복사 위해 새로운 공간 생성
		int[] cr = new int[arr.length];
		// 내부 데이터 복사
		for (int i = 0; i < arr.length; i = i + 1) {
			cr[i] = arr[i];
		}
		cr[0] = 500;
		// 이번에는 데이터를 복사해서 주었기 때문에 영향을 받지 않는다.
		System.out.println(arr[0]);
	}

}
