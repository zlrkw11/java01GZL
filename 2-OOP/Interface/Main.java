package Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();
    }
}
