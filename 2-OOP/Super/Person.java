package Super;
public class Person {
    
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    // super method
    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }

}
