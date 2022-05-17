import java.io.*;
import java.util.Scanner;  

interface In1 {
    
    void display();
}

class TestClass implements In1 {
    
   
    public void display(){ 
      
      System.out.println("Here's the student"); 
    }
  

    public static void main(String[] args)
    {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      //System.out.println("Enter name of sudent");
      //String studentname = myObj.nextLine();  // Read user input
        TestClass t = new TestClass();
        t.display();
        
        people obj = new student();  
          
       
        student5 s1 = new student5("ssss");
          s1.display();  

    Students s=new Students();  
            s.setName("vijay");  

        System.out.println(s.getName());  
        System.out.println("Enter Id of sudent");
      int id = myObj.nextInt();  // Read user input
      obj.run(id);
        try {
          System.out.println(id * 100);
        } catch (Exception e) {
          System.out.println("Something went wrong.");
        }
   
    }
}
abstract class people{  
 
    abstract void run(int i);  
   
  }  
  class student extends people{  
    void run(int i){
     System.out.println("Student");
    }  
    }  
    class  Council extends people {
      void run(int i){
        i = i;
        if(i >5)
        System.out.println("Ms. queer");
        else
        System.out.println("Ms. dawk");

      }
}
    
 
    
 
