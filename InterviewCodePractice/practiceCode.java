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
##########################################	
    static boolean isHelloWord(String str) { 
        return str == "Hello World"; // scary code 
        return str.equals("Hello World"); // correct, but what happens if str is null? throw null pointer exception
        return "Hello World".equals(str); // expected solution
    }
    
    public static void main(String[] args) {
        System.out.println(isHelloWord("Hello World"));
        System.out.println(isHelloWord(null));
	
       Integer a = 127;
       Integer b = 127;
       Integer c = 128;
       Integer d = 128;

       System.out.println(a == b); // true or false? T
       System.out.println(c == d); // true or false? F
//Why? Because integer values between -128 and 127 are cached, but 128 is not.
    }
#########################################
JAVA Sample code:
1. SWAP two int without temp variable. 
Int x=10, y=5;
//code to swap ‘x’ and ‘y’
x = x + y; //x now becomes 15
y = x - y; //y now becomes 10
x = x - y; //x now becomes 5
2. Singleton Design:
1)	Singleton Design Pattern: // constructor as private, private static instance/obj
Class Singleton { 
    private static Singleton obj = null;    
    private Singleton() {}
    public static Singleton getInstance() 
    { 
        if (obj == null) 
            obj = new Singleton(); 
          return obj; 
    } 
} 
3. ArrayList example

ArrayList al = new ArrayList();
al.add(3);
al.add(2);
al.add(1);
al.add(4);
al.add(5);
al.add(6);
al.add(6);
Iterator iter1 = al.iterator();
while(iter1.hasNext()){
System.out.println(iter1.next());
}
4. LinkedList example

LinkedList ll = new LinkedList();
ll.add(3);
ll.add(2);
ll.add(1);
ll.add(4);
ll.add(5);
ll.add(6);
ll.add(6);
Iterator iter2 = al.iterator();
while(iter2.hasNext()){
System.out.println(iter2.next());
}


5. MASK Credit card
public class MaskTest {

	public static void main(String[] args) {
		System.out.println(mask("1234-5678-9101-5555"));
		System.out.println(maskWithSB("1234-5678-9101-5555"));
	}
	public static String mask(String cc){
		String x = "xxxx-xxxx-xxxx-";		
		return x+cc.substring(15,19);
	}
	
	public static String maskWithSB(String cc){
		String x = "xxxx-xxxx-xxxx-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(cc,15,19);
		return sb.toString();
		
	}

}
6. Replace String without replace() method:
String str = "The Haunting of Hill House!";
int pos = 7; char rep = 'p';
String res = str.substring(0, pos) + rep + str.substring(pos + 1);
7. Reverse String without reverse() method
public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }      
        return reverse;
    }
8. find duplicates
for (int i = 0; i < names.length; i++) { 
    for (int j = i + 1 ; j < names.length; j++) { 
if (names[i].equals(names[j])) { // got the duplicate element } } }
9. find duplicate for single character 
String s = "elephant"; char someChar = 'e'; int count = 0;
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == someChar) {
        count++;
    }
} 
assertEquals(2, count);


10. remove repeated elements from ArrayList
List<Integer> primes = new ArrayList<Integer>();
       
  primes.add(2);
  primes.add(5);
  primes.add(7);  //duplicate
  primes.add(7);
  primes.add(11);  
 Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
 primes.clear();       
 primes.addAll(primesWithoutDuplicates); // copying without any duplicates
 System.out.println("list of primes without duplicates : " + primes);
11. Array to List
String[] array = { "hawk", "robin" }; // [hawk, robin]
List<String> list = Arrays.asList(array); // returns fixed size list
System.out.println(list.size()); // 2
12. List to Array
List<String> list = new ArrayList<>();
list.add("hawk");
list.add("robin");
	Object[] objectArray = list.toArray();
	System.out.println(objectArray.length); // 2
	String[] stringArray = list.toArray(new String[0]);
	System.out.println(stringArray.length); // 2
13. find duplicate Word
static void findDuplicateWord(String str){
String[] splitStr = str.split(" ");
		
	HashMap<String, Integer> hm = new HashMap<>();
	for(String tempStr: splitStr){
		System.out.println(tempStr);
			
		if(hm.get(tempStr) != null){
		   hm.put(tempStr, hm.get(tempStr)+1);
		}
		else
		hm.put(tempStr, 1);
	}
	System.out.println(hm);
		
	Iterator<String> strItr = hm.keySet().iterator();
	while(strItr.hasNext()){
	     String temp = strItr.next();
	     if(hm.get(temp)>1){
	     System.out.println("the workd " + temp + " appeared "+ hm.get(temp) + " times.");
				
	     }
	}
}

14. find duplicate char in a String
static void findDuplicateChar(String str){
		
	HashMap<Character, Integer> hm = new HashMap<>();
		
	for(int i = 0; i<str.length(); i++){
	    char c = str.charAt(i);			
	    if(hm.get(c) !=null){
		hm.put(c, hm.get(c)+1);				
	    }
	    else
	    hm.put(c,1);
	}
		
	Iterator<Character> chrItr = hm.keySet().iterator();
	while(chrItr.hasNext()){
	     char temp = chrItr.next();
	     if(hm.get(temp)>1){
                System.out.println("the char " + temp + " appeared "+ hm.get(temp) + " times.");
				
	     }
}
		
}
15. print 3D array
int [][][] test3D = {
				{	
					{1,2,3},
					{4,5}
				},
				{
					{6,7},
					{8}
				}
		};
		
		for (int[][] array2D: test3D) {			
	         for (int[] array1D: array2D) {
	           for(int item: array1D) {
	              System.out.print(item+ " ");
	           }System.out.println();
	        }System.out.println();
	     }
	}
16. print triangle pattern
 Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows to be printed"); 
        int rows = sc.nextInt(); 
  
        // loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) {              
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); // print number of spaces
            }               
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); // number of stars
            }   
            // for new line after printing each row 
            System.out.println(); 
        } 

17. String to Date data type
import java.util.Date; 
String sDate1="31/12/1998"; 
String sDate5 = "Thu, Dec 31 1998 23:37:50"; 
SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
Date date1=formatter1.parse(sDate1);
Date date5=formatter5.parse(sDate5);

18. Date to String
Date date = Calendar.getInstance().getTime();  
DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
String strDate = dateFormat.format(date);                  
System.out.println("Converted String: " + strDate);  

