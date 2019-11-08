import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = System.getProperty("user.dir") +"\\src\\tags.log";
		System.out.println(fileName);
		
		Set<String> tagsList = getHashTags(fileName);
		System.out.println(tagsList.size());
		
		for(String hashtags: tagsList)
			System.out.println(hashtags);
		

	}
	
	public static Set<String> getHashTags(String fileName) throws IOException {
		BufferedReader bufferedReader = null;
		String line = "";
		//Set<String> hashTags = new HashSet<>();
		//for sorted use TreeSet
		Set<String> hashTags = new TreeSet<>();
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			
			while((line = bufferedReader.readLine()) != null){
				String[] words = line.split("[^\\w#@]+");
				
				for(String word : words){
					if(word.contains("#")){
						word = word.replaceAll("^[^#]*", "");						
							hashTags.add(word);
					}
				}				
			}
			
			//hashTags.sort(String::compareTo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			bufferedReader.close();
		}	
		
		return hashTags;
	}

}
