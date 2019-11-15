public class Calculator {

    public int addNumbers(int... numbers) {
        int total = 0;
        System.out.println(numbers.length);
        if(numbers.length==1){
        	total=numbers[0];
        	return total;
        }
        else if(numbers.length>1){
	        for (int number : numbers) {
	            total += number;
	        }
	        return total;   
        }
        else{
        	throw new ArithmeticException("no number added.");
        }
        
    }
}
