// import the ArrayList package here
// an ArrayList has no fixed size making it a lot cooler than a regular array (although more complex)
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Moo";
    String toDo3 = "Meow";
    
    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    System.out.println(toDoList);
      
    
  }
  
}

//
//
// Array list size via .size
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());
      
    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirot");
  }
  
}

//
//
//
// Get item from Array List via .get()
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));
    
  }
  
}

//
//
//
// Change ArrayList values with set
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}

//
//
//
// Remove values from ArrayList by either location or first instance of name .remove()
ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]

// The approach below will only remove the first instance of the values entered
ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove("Trench Coat");
// shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]

//
//
//
// Get index of value via indexOf()
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    int solved = sherlocksToDos.indexOf("solve the case");
      
    // Change the value printed:
    System.out.println(solved);

  }
  
}

//
//
// Learned notes
/*
Creating an ArrayList.
Adding a new ArrayList item using .add().
Accessing the size of an ArrayList using .size().
Finding an item by index using .get().
Changing the value of an ArrayList item using .set().
Removing an item with a specific value using .remove().
Retrieving the index of an item with a specific value using .indexOf().
*/