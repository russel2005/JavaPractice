public abstract class UIControl{
	public void enable(){
	    System.out.println();
	}
	
	public abstract void draw();
	
}

public class TextBox extends UIControl{
	@override
	public void draw(){
		System.out.println("drawing a text box.");
	}
}

public class CheckBox extends UIControl{
	@override
	public void draw(){
		System.out.println("drawing a checkbox.");
	}
}


public class Main {
	public static void main(String[] args){
		drawUIControl(new TextBox);
		drawUIControl(new CheckBox); //this is polymorphism in action.
	}

	public static void drawUIControl(UIControl control){
		control.draw();
	}

}
