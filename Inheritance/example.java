public class UIControl{
	public void enable(){
	    System.out.println();
	}	
}

public class TextBox extends UIControl{
}

public class Main {
	public static void main(String[] args){
		TextBox textBox = new TextBox();
		textBox.enable();//enable method implements in UIControl class which inheritated in TextBox class
	}
}
