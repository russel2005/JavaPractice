public interface TaxCalculator{

public calcualteTax();

}


public class TaxCalculator2020 implements TaxCalculator {

	@Override
	public float calculateTax() {
		return 2.0f;
	}
}


public class Main {

	public static void main(String [] args){

	     TaxCalculator calculator = getCalculator();
	     calculator.calculateTax();

	}

	public static TaxCalculator getCalculator(){
		return new TaxCalculator2020();
	}
}
