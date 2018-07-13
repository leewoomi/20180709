
public class CharatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HeLLo";
		int size = str.length();
		String result= "";
		for(int i =0;i<size ; i++) {
			char ch = str.charAt(size-(i+1));
			
			if(ch>='a' && ch<='z') {
				ch =(char) (ch -32);
			}else if ( ch>='A' && ch <='Z') {
				ch = (char)(ch+32);
			}
			result = result+ch;
			System.out.print(ch);
		}
		
		
	}

}
