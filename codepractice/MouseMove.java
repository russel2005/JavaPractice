import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MoMove {
    public static final int ONE_MIN =60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
    static Robot robot;

    public static void main(String... args) throws Exception {
        robot = new Robot();       
        boolean rand_bool = ThreadLocalRandom.current().nextBoolean();
        howLong(30);
        restartOrLogoff(rand_bool);        
    }
    
    static void howLong(int min){
    	 Random random = new Random();
    	 int t=0;
    	 if(min>=0)
    		do{
    			try {
    				Thread.sleep(ONE_MIN);
    				robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
    			} catch (InterruptedException e) {e.printStackTrace();}
    			min--;
    			System.out.println("time remaining: "+min+" minutes");
    		}while(min>t);
		System.out.println("Done.");		
    }
    static void keySpace() {
    	  robot.keyPress(KeyEvent.VK_SPACE);
    	  robot.keyRelease(KeyEvent.VK_SPACE);
    }
    
    static void keyEnter(){
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    static void restartOrLogoff(boolean rand_bool){
        Runtime rt=Runtime.getRuntime();         
        try
        {
          // Process s=rt.exec("cmd /c shutdown -s -t 60"); // for shutdown here 60 seconds
          // Process r=rt.exec("cmd /c shutdown -r"); // for restart
        if(rand_bool){
        	 rt.exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation"); // for lock
        	   
        }
        else{rt.exec("cmd /c shutdown -l"); }// for log off     
        }
        catch(Exception e)  {	System.out.println(e);  }
    }
    
    static void rndboolean(){
    	for (int i=0; i<=9; i++){
    		System.out.println(ThreadLocalRandom.current().nextBoolean());
    	}
    }
}
