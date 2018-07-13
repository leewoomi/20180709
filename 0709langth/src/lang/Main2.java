package lang;

public class Main2 {// User Main

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNum(1);
		user1.setName("이우미");
		// 배열은 만들 때 초기화 해서 줌 안하면 에러!!!
		String[] hobbies = { "독서", "영화감상" };
		user1.setHobbies(hobbies);

		// toString을 호출해서 내부 내용 확인
		// System.out.println(user1);

		// user1의 데이터가 저장된 곳의 주소를 user2에 복사

		User user2 = user1;
		user2.setNum(2);
		System.out.println(user1);

		User user3 = user1.clone();
		user3.setNum(3);
		user3.setName("수지");
		user3.getHobbies()[0] = "연기";
		System.out.println(user1);
		System.out.println(user3);

		Integer i = new Integer(10);//java.lang.Integer
		System.out.println(i);//toString()호출
		i = 20;//AutoBoxing
		System.out.println(i);
		i = Integer.parseInt("500");
		System.out.println(i);
		//i = Integer.parseInt("34k");//java.lang.NumberFormatException
		//System.out.println(i);
		//i = Integer.parseInt("3 4");//java.lang.NumberFormatException
		//System.out.println(i);
	}

}
