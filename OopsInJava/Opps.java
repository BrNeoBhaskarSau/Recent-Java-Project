
class pan{
    String color;
    String type; //Ballpoint; gel
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name , int age){
        System.out.println("Constructor called");
        this.name = name; 
        this.age = age;
    }

}
public class Opps{
    public static void main(String[] args) {
        // System.out.println("Hello Wrold!");
        // pan pen1 = new pan();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();
        // pan pen2 = new pan();
        // pen2.color = "black";
        // pen2.type = "ballpoint";
        // pen1.printColor();
        // pen2.printColor();
        
        Student s1 = new Student( "Bbhaskar", 9);
        // s1.Student();
        // s1.name = "Bhaskar";
        // s1.age = 19;
        s1.printName();

    }
}