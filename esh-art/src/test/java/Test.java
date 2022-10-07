
public class Test {

	public void replaceSpaceInString() {
		String str1 = "Good Morning";
		char s = ' ';
		//char q='?';
		// String str2[]=str1.split(" ");

		int len = str1.length();
		// System.out.println(str2[0]+"??"+str2[1]);

		char a[] = str1.toCharArray();

		for (int i = 0; i <= len - 1; i++) {

			if (str1.charAt(i) == s) {
                
				char t=str1.charAt(i-1);
				System.out.print("??");
			
			}
			System.out.print(str1.charAt(i));
			
		}

	}

	public static void main(String src[]) {

		Test t1 = new Test();

		t1.replaceSpaceInString();

	}
}
