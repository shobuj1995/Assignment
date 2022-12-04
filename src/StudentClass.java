import javax.xml.namespace.QName;

public class StudentClass {
   // Constructor
      StudentClass(String name,int roll,float result){
          System.out.println("This is a constructor");
         Name = name;
         Roll =roll;
         Result = result;


    }
    //Variable Declaration
    String Name;
    int Roll;
    float Result;

    //Method
    void display(){
        System.out.println("Student Name is: "+ Name + " Roll Number is: "+ Roll + " Result is: "+ Result);

    }





}

class mainclass{
    public static void main(String []args){
        StudentClass Object = new StudentClass("Rony",1, 3.5F);
        Object.display();


    }
}
