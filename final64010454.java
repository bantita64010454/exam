import java.io.*;
//import java.util.Scanner;  

interface In1 {
    
    
    final int a = 10;
  
    void display();
}

class TestClass implements In1 {
    
   
    public void display(){ 
      
      System.out.println("Here's the student"); 
    }
  

    public static void main(String[] args)
    {
      //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      //System.out.println("Enter name of sudent");
      //String studentname = myObj.nextLine();  // Read user input
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
        people obj = new student();  
        obj.run();  
        obj.changeGear();  
        student5 s1 = new student5(1111, "ssss");
          s1.display();  

    Students s=new Students();  
            s.setName("vijay");  

        System.out.println(s.getName());  
   
    }
}
abstract class people{  
  people(){System.out.println("bike is created");}  
    abstract void run();  
    void changeGear(){System.out.println("gear changed");}  
  }  
  class student extends people{  
    void run(){
     System.out.println("Student");
    }  
    }  
    class  Council extends people {
      void run(){
        System.out.println("r unning safely..");
      }
}
    
 