/*
Common String Methods

length()
concat()
equals()
indexOf()
charAt()
substring()
toUpperCase() / toLowerCase()
*/

public class HelloWorld {
  
	public static void main(String[] args) {
    
    String str = "Hello, World!";
    
    // Examples:

    System.out.println(str.length());
    
    System.out.println(str.substring(4));
    
    System.out.println(str.toUpperCase());
    
  }
  
}


//
// length
public class TweetCounter {
  
	public static void main(String[] args) {
    
    String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";  

    // What's the character count?
    System.out.println(tweet.length());
    
  }
  
}

//
// concat
public class CombineNames {
  
	public static void main(String[] args) {
    
    // Add your first names:
    String firstName = "Ziggy";  
    String lastName = "Stardust";

    // What's the full name?
    System.out.println(firstName.concat(" " + lastName));
    
  }
  
}

//
// equals (same as ==)
public class Password {
  
  public static void main(String[] args) {
    
    String password = "correcthorsebatterystaple";
    
    // Write the code:
    System.out.println(password.equals("Tr0ub4dor&3"));
    
  }
  
}

//
// indexOf
public class MorseCode {
  
  public static void main(String[] args) {
    
    String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

    // Write the code:
    System.out.println(code.indexOf(". .- -"));
    
  }
  
}

//
// chartAt
public class Initials {
  
	public static void main(String[] args) {
    
    // Add a first name and a last name:
    String firstName = "Sonny";  
    String lastName = "Li";
    
    // What are the initials?
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));
    
  }
  
}

//
// substring
public class Poetry {
  
	public static void main(String[] args) {
      
    String line = "The Heav'ns and all the Constellations rung";     
    // Change the arguments:
    System.out.println(line.substring(4, 11));
    
  }
  
}

//
// toLowerCase
public class Hashtag {
  
  public static void main(String[] args) {
    
    String hashtag = "#100DaysOfCode";
    
    // Make the hashtage lowercase:
    System.out.println(hashtag.toLowerCase());
    
  }
  
}