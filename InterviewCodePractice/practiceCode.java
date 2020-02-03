Q #01) reverse a string without using String inbuilt function.
Q #02) swap two numbers without using the third variable.
Q #03) find each/duplicate character count in a String.
Q #04) difference equals() vs ==
###01 answer:
#a) 
    String str = "java programming";		
		for(int i = str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
    
#b) //iterative method
		char[] strArray = str.toCharArray();
		for(int i = strArray.length-1; i >=0; i--){
			System.out.print(strArray[i]);
		}
    
###02 answer:
int x=5, y=10;
 x = x + y;
 y = x - y;
 x = x - y;

###03 answer:
String str = "this is java code and java is fun java";		
		char[] charStr = str.toCharArray();		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char c: charStr){
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);			
		}	
		
		//print duplicate char exclue white space
		for(char c: hm.keySet()){
			if(hm.get(c)>1 && !Character.isWhitespace(c))
			    System.out.println(c+"->"+hm.get(c));
		}
		
		//Print distinct characters
        for(char c : hm.keySet()) {
            if(hm.get(c) == 1) {
                System.out.println(c);
            }
        }
###04 answer:
String s1 = "text";
String s2 = "text";
String s3 = "t" + "ext";

System.out.println(s1 == s2); // true or false?
System.out.println(s2 == s3); // true or false?

#output: true
#output: true
	
    static boolean isHelloWord(String str) { 
        return str == "Hello World"; // scary code 
        return str.equals("Hello World"); // correct, but what happens if str is null? throw null pointer exception
        return "Hello World".equals(str); // expected solution
    }
    
    public static void main(String[] args) {
        System.out.println(isHelloWord("Hello World"));
        System.out.println(isHelloWord(null));
    }
