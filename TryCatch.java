public class Debug {

    public static void main(String[] args) {
      
      int width = 0;
      int length = 40;
      
      try {
        
        int ratio = length / width;
        
      } catch (ArithmeticException e) {
        
        System.err.println("ArithmeticException: " + e.getMessage());
        
      }
      
    }
    
  }

/*
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed if an error occurs in the try block.
*/