import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertieValues {
	
	private Properties prop;
	
	GetPropertieValues(String configFileName){
		try {
			//configFileName = "config.properties";
			this.prop = new Properties();
			this.prop.load(new FileInputStream(System.getProperty("user.dir") + "\\resources\\" + configFileName));
			
		}catch (FileNotFoundException e) {
			System.out.println("property file '" + configFileName + "' not found in the classpath");
        }catch (IOException e) {
           System.out.println("IOException throws when reading the properties file.");
        }
	}
	

	public Properties getPropValues(String configFileName) throws IOException { 
		
		return this.prop;
	}
	
	public String getAppName() {
        return prop.getProperty("app.name");
    }

	public String getUserName() {
        return prop.getProperty("username");
    }
	
	public String getPasswd() {
        return prop.getProperty("password");
    }
	
	public String getCompany() {
        return prop.getProperty("company");
    }
	
	public String getValue(String value){
		return prop.getProperty(value);
	}
	
	public void clearPropertieFile(){
		prop.clear();
	}
}
