import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		// Hello World를 100만번 출력하는데 걸리는 시간을 측정해서 출력

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			System.out.println("Hello World");
		}

		long end = System.currentTimeMillis();
		System.out.println("작업시간 : " + (end - start));

		// path 환경 변수의 값을 출력
		System.out.println(System.getenv("path"));
		// 자신의 자바 버전을 출력
		System.out.println(System.getProperty("java.version"));
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad.exe");//메모장이 열린다.
			r.exec("mspaint.exe C:\\Users\\503-08\\Desktop\\강아지.PNG");//그림판으로 강아지사진이 열린다.
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");//크롬이 열린다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
