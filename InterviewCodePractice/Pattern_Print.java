### 1. Right Triangle 
 * 
 * * 
 * * * 
 * * * * 
 * * * * *
public static void pyramidPattern(int n){  
   for (int i=0; i<n; i++) {
       System.out.print(" "); 
       for (int j=0; j<=i; j++ ) {
           System.out.print("* ");
       } 
       System.out.println(); 
   } 
}   
public static void main(String args[]) { 
        int n = 5; 
        pyramidPattern(n); 
    }
    

### 2. Right triangle with number
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
public static void pyramidNumPattern(int n){  
 int num ;
 for (int i=0; i<n; i++) {
    num = 1;
    for (int j=0; j<=i; j++ ) {
       System.out.print(num + " ");
       num++;
     } 
    System.out.println(); 
  } 
}  

### 3.	Right triangle without reassign
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
public static void pyramidNumPattern2(int n){  
//without reassign		
 int num =1;
 for (int i=0; i<n; i++) {
 // num = 1;
   for (int j=0; j<=i; j++ ) {
      System.out.print(num + " ");
      num = num +1;
   } 
   System.out.println(); 
 } 
} 
public static void main(String args[]) { 
        int n = 5; 
        pyramidNumPattern2 (n); 
} 

### 4.	Left Triangle 
           * 
         * * 
       * * * 
     * * * * 
   * * * * *
public static void pyramidPattern(int n) 
    {  int i, j;
        for (i=0; i<n; i++) {
        	for(j=2*(n-i); j>=0; j--){ 
                System.out.print(" "); 
            } 
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            } 
            System.out.println(); 
        } 
    }   
    public static void main(String args[]) { 
        int n = 5; 
        pyramidPattern(n); 
    }

### 5. Pyramid
    * 
   * * 
  * * * 
 * * * * 
* * * * *
Scanner sc = new Scanner(System.in); 
System.out.print("Rows Wants In Your Pyramid?"); 
int noOfRows = sc.nextInt();
int rowCount = 1;
for (int i = noOfRows; i > 0; i--){
     for (int j = 1; j <= i; j++) {
          System.out.print(" ");
     }
     for (int j = 1; j <= rowCount; j++){
          System.out.print("* ");
     }
         System.out.println();
         rowCount++;
}

### 6. Diamond Shape Pattern 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt(); 
		 
for(int i=1; i<=n; i++){
   for(int j=1; j<=n-i; j++){
      System.out.print(" ");
   }		 
   for(int j=1; j<=i*2-1; j++){
      System.out.print("*");
   }
   System.out.println();		 
} 
		
for(int i=n-1; i>0; i--){//below are same code 
   for(int j=1; j<=n-i; j++){
      System.out.print(" ");
   }
   for(int j=1; j<=i*2-1; j++){
      System.out.print("*");
   }
   System.out.println();
}
sc.close();

