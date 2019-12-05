class FirstFactorial {

  public static int Factorial(int num) {
    // code goes here  
    if(num<0)
      System.out.print("Error, factorial can't be negarive.");
    int fact=1; 
    for(int i=1; i<=num; i++)
      fact *= i;
    num = fact;
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    System.out.print("factorial: "+Factorial(10));
  }

}
