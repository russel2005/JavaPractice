public class StringLength {

	public static void main(String[] args) {
		// with for Each loop
		String s = "i am a programmer";
		char [] ch = s.toCharArray();
		int i =0;
		for(char c: ch){
			i++;
		}
		System.out.println("length of string: " +i);
		
    //with while loop
		i=0;		
		try {
			while(true){
				s.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("length of string: " +i);
		}
	}
}
