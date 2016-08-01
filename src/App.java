class Person {

    //instance variables
    String name;
    int age;

    //class creates an Object Type
    //classes contain
    //1. Data
    //2. Subroutines (methods)
    //this is a method
    void speak() {
        System.out.println("Hello. My name is: " + name + " and I am " + age + " years old ");
    }
}

/**
 * Created by LordwolF on 7/31/2016.
 */
public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "LordwolF76";
        person1.age = 40;
        
        //here we call the method
        person1.speak();

        Person person2 = new Person();
        person2.name = "PerfectingSilence";
        person2.age = 16;
        person2.speak();

        System.out.println(person1.name + "  " + person1.age);
        System.out.println(person2.name + "  " + person2.age);
    }
}