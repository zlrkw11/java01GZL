package Interface;

public class Fish implements Prey, Predator {
    
    public void hunt(){
        System.out.println("The fish is hunting smaller fish");
    }

    public void flee(){
        System.out.println("The fish is fleeing from a bigger fish");
    }
}
