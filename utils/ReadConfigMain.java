public class ReadConfigMain {

	public static void main(String[] args) throws IOException {
		GetPropertieValues gp = new GetPropertieValues("config.properties");
	//	gp.getPropValues("config.properties");
		System.out.println(gp.getAppName());
		System.out.println(gp.getUserName());
		System.out.println(gp.getCompany());
		System.out.println(gp.getValue("password"));

	}

}
