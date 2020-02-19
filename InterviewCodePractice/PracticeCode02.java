/**
1)	Remove white space without built-in method
2)	Reverse string
3)	Find String length without built-in method
4)	Char to String
5)	Fibonacci Number
6)	Sum of Digits given number like 123 = 6
7)	String to char
8)	Reverse String like: java programming> gnimmargorp avaj
9)	Reverse each String words like: this is java > siht si avaj
10)	PrimeNumber
11)	Remove duplicate from Array or List.
12)	Find Duplicate Characters in String:
13)	Find Duplicate from Array
14)	Find 2nd highest number form Array
15)	Sorting implement
16)	Find a given string is number or not
17)	Count Occurrences Of Each Element In Array
18)	Count Occurrences of Each word in Array
19)	Reverse Array
*/

###1)
char[] charArray = str.toCharArray();
String stringWS = "";
for (int i = 0; i < charArray.length; i++){
   if (charArray[i] != ' '){
         stringWS = stringWS + charArray[i]; }
}
//or
String str = "this is java code";
String[] strArray = str.split(" ");
String tempStr = "";
for(String s: strArray){
   tempStr += s;
}
out.print("without sp: " +tempStr);


###2)
String str = "MyJava"; 
char[] chars = str.toCharArray(); 
for (int i = chars.length-1; i >= 0; i--){
  System.out.print(chars [i]);
}


###3) a> with for each loop
String str = "this java code";
int count =0;
for(char c : str.toCharArray())
    count++;
System.out.println("length: " +count);


###3) b> with while loop
public int strLength(String str){
   int i=0;
   try{
      while(true){
         str.charAt(i);
	i++;
      }
}catch(IndexOutOfBoundsException e){
    return i;
 }
}


###4)
char myChar = 'r';		
String myStr = Character.toString(myChar);
//or
String myStr2 = String.valueOf(myChar);


###5)
int num=10, a=0, b=0, c=1;
System.out.print("fibonacci num:");
for(int i=0; i <= num; i++){
    a = b;
    b = c;
    c = a+b;
    System.out.print(c + " ");
}


###6)
int givenNum = 123;
int sum =0;
while(givenNum != 0){
   int remainder = givenNum%10;
   sum += remainder;
   givenNum = givenNum/10;
}	
System.out.println(sum);


###7)
String str = "Russel";	
System.out.println(str.length());
for(int i=0; i<str.length(); i++){
   char ch = str.charAt(i);
   print("Char at"+i+" Pos: "+ch);
}


###8)
//reverse string with charAt() method
String str = "i am java programmer";		
for(int i=str.length()-1; i>=0; i--){
   System.out.print(str.charAt(i));
}	
//using iterative method
char[] strArray = str.toCharArray();
for(int i=strArray.length-1; i>=0; i--){
   System.out.print(strArray[i]);
}


###9)
String str = "this is java code";
String [] strwords = str.split(" ");
String tempStr="";
String reverseWord="";	
for(int i = 0; i<strwords.length; i++){
  char[] chars = strwords[i].toCharArray();
    reverseWord="";
    for(int j = chars.length-1; j>=0; j--){  
        reverseWord += chars[j];
    }
  reverseWord += " ";
  tempStr += reverseWord;
}
System.out.println("reverse str: " +tempStr);


###10) Prime Number
int num =100;	       
String  primeNumbers = "";

for (int i = 1; i <= num; i++){  		  	  
    int counter =0; 	  
    for(int j =i; j>=1; j--){
        if(i%j==0) {
	  counter += 1;
	}
    }
    if (counter ==2) {		     
	primeNumbers += i + " ";
    }	
}	
System.out.println("Prime numbers from 1 to 100 are :");
System.out.println(primeNumbers);


###11)
//remove duplicate from Array
String[] strArray = {"russel","Arish","momo","russel"};
LinkedHashSet<String> withoutDup = 
new LinkedHashSet<>(Arrays.asList(strArray));
out.println("without duplicate:" + withoutDup);

//remove duplicate from List
ArrayList<String> al = new ArrayList<>();
    al.add("Russel");
    al.add("Arish");
    al.add("Russel");		
HashSet<String> hs = new HashSet<>(al);
    System.out.println(hs);
		
ArrayList<String> woutDup = new ArrayList<>(hs);
System.println("without dup: " + woutDup);

###12)
String str = "butter Better bad boy";
char [] strArray = str.toCharArray();	
HashMap<Character, Integer> charMap = new HashMap<>();		
for(char c: strArray){
   if(charMap.containsKey(c))
      charMap.put(c, charMap.get(c)+1);
   else
      charMap.put(c, 1);
}		
Set<Character> charsInString = charMap.keySet();
for (Character ch : charsInString)
   {
    if(charMap.get(ch) > 1 && 
       !Character.isWhitespace(ch))
    {.out.println(ch +" : "+ charMap.get(ch));}
}

###13)
int[] array={2,5,5,6,6,7,2};
		 
for (int i=0; i<array.length; i++) {
for (int j=i+1; j< array.length; j++){
   if ((array[i] == 
            array[j]) && (i != j)){
  out.println("Duplicate: "+array[j]);
   }
  }
 }

###14)
int[] input = {45, 51, 28, 75, 49, 42};
int firstL, secondL;		 
if(input[0] > input[1]){
   firstL = input[0];
   secondL = input[1];
}else {
   firstL = input[1];
   secondL = input[0];
}
for (int i = 2; i < input.length; i++){
    if(input[i] > firstL){
       secondL = firstL;
       firstL = input[i];
    }else if (input[i] < firstL 
          && input[i] > secondL ) {
           secondL = input[i];
  }
}System.out.println(secondL);

###15)
int[] inArr = {45, 84, 101, 62, 12, 45}; 
int temp, pos;
for (int i = 0; i < inArr.length; i++){
    pos = i;
    for (int j = i+1; j < inArr.length; j++){
        if(inArr[j] < inArr[pos] ){
	 pos = j;
        }
     }
     temp = inArr[i];
     inArr[i] = inArr[pos];
     inArr[pos] = temp;
}
	 
for (int i = 0; i < inArr.length; i++){
    System.out.print(inArr[i] + " ");
}
System.out.println();

###16)
static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }

###17)
int[] inArr = {45, 84, 45,101, 101, 12, 45}; 
HashMap<Integer, Integer> eleCountMap = new HashMap<>();
for (int i : inArr) {
    if(eleCountMap.containsKey(i)) {
      eleCountMap.put(i, eleCountMap.get(i)+1);
    } else {
        eleCountMap.put(i, 1);
    }
}
  System.out.println("Input: " +Arrays.toString(inArr));
  System.out.println("Element Count : " +eleCountMap);

###18)
String[] array = {"book","java","book","java","java","js","js","book"};

HashMap<String,Integer> hm = new HashMap<>();    
for(String x : array){
   if(!hm.containsKey(x)){
      hm.put(x,1);
   }else{
      hm.put(x, hm.get(x)+1);
   }
}
System.out.println(hm);
for(String s : hm.keySet()){
    System.out.println(s + ":" + hm.get(s)); }

###19)
int[] iArr = {4, 5, 8, 9, 10};
int i, temp;        
for (i=0; i<iArr.length/2; i++) {
 temp = iArr[i];             
 iArr[i] = iArr[iArr.length-1-i];             
 iArr[iArr.length-1-i] = temp;
}         
.out.println("Array Reverse: " +Arrays.toString(iArr));






