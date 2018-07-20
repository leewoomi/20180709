
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ACCGCCGACDGCCG";
		String codon = "GCCG";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == codon.charAt(0)) {
				int idx = i;
				int j;
				for (j = 2; j < codon.length(); j++) {
					if (str.charAt(idx + j) != codon.charAt(j)) {
						break;
					}
				}
				if(j== codon.length()) {
					System.out.println(idx);
					i=i+codon.length()-1;
				}
			}
		}
	}

}
