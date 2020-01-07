public class RemoveWhitespaces {
	    public static void main(String[] args) 
	    {
	         
	        String inputString = "Enter input string to be cleaned from white spaces...!";
	         
	        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
	        
	        //Remove White Spaces From String Without Using Built-In Methods
	        char[] charArray = inputString.toCharArray();
	         
	        String stringWithoutSpaces2 = "";
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces2 += charArray[i];
	            }
	        }
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces2);
	         
	    }

}
