public class MailService {
	public void sendEmail(){
	    connect();
	    authorization();
		//write actual mail 
	    disconnet();
	}

	private void connect(){
	    System.out.println("connect");
	}

	private void disconnect(){
	    System.out.println("disconnect");
	}

	private void authorization(){
	    System.out.println("Authorized");
	}
}


public class Main {
	public static void main(String[] args){
		MailService mailService = new MailService();
		mailService.sendEmail;//here connect(), disconnect(), authorization() not accesible because of private method
	}
}
