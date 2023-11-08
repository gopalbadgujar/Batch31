package eps3;

public class PracQ1 {

	public static void main(String[] args) {

//Write a java program to convert a string to lower case.
		String name1  ="Hello_Brother";
		System.out.println(name1.toLowerCase());

		// String s = name.toLowerCase();
		//System.out.println(s);
		
//Write a java program to replace spaces with underscore.
		String name2 = "Hello Aakash, We are learning String methods.";
		System.out.println(name2.replace(" ", "_"));
		
		//another type to execute 
		String s = name2.replace(" ", "_");
		System.out.println(s);
		
		
// Replace <|name|>	with a String(Some name).
		String name3 = "Dear <|name3|>, Thanks a lot !";
		String str = name3.replace("<|name3|>", "Aakash");
		System.out.println(str);
		

// Write a java program to detect Double & Triple spaces of given string.
		String mystring = "This string  contains  double  and   triple spaces.";
		System.out.println("Number of Double spaces in a string is : "+mystring.indexOf("  "));
		System.out.println("Number of Triple spaces in a string is : "+mystring.indexOf("   "));
			
	}
	
}
