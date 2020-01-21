Q #01) reverse a string without using String inbuilt function.
Q #02) swap two numbers without using the third variable.
Q #03) find each/duplicate character count in a String.
Q #04) find each/duplicate word count in a String.
Q #05) remove duplicate form ArrayList
###01 answer:
a) 
    String str = "java programming";		
		for(int i = str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
    
b) //iterative method
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
