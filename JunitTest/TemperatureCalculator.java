public class TemperatureCalculator {
	
	public float toFahrenheit(float degree) {
        return (degree * 9 / 5) + 32;
    }
 
    public float toDegree(float fahrenheit) {
        return (fahrenheit - 32) * (float) (5.0 / 9.0);
    }
}
