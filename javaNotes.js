/*
Use formatting of JavaScript then convert file back to Java since I don't want to install Java on this machine
*/

//Hello World
public class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Hello World!");
    }
  }


//Terminal compile command (helps find errors) for files, "javac myFile.java"
//It will create something like "myFile.class" to compile it type "java myFile" IGNORE the .class bit

/*
Java programs have at least one class and one main() method.
Each class represents one real-world idea.
The main() method runs the tasks of the program.
Java comments add helpful context to human readers.
Java has whitespace, curly braces, and semicolons.
Whitespace is for humans to read code easily.
Curly braces mark the scope of a class and method.
Semicolons mark the end of a statement.
Java is a compiled language.
Compiling catches mistakes in our code.
Compilers transform code into an executable class.
*/

//Simple Java example
public class Review{
    public static void main(String[] args) {
        //The main method executes the tasks of the class
      System.out.println("My first Java program from scratch!");
      }
  }


//Variables
public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);
	}
}


//.equals() for strings
public class Song {
  public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    System.out.println(line1.equals(line2));
    System.out.println(line2.equals(line3));
  }       
}

//concatonate a string
public class Zoo {
  public static void main(String[] args){
    int animals = 12;
    String species = "zebra";
    String zooDescription = "Our zoo has "+animals+" "+species+"s!";
    System.out.println(zooDescription);
  }       
}


//Class example
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}