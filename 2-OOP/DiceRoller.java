import java.util.Random;
public class DiceRoller {
    
    Random random;
    int number = 0;

    // constructor
    DiceRoller(){
        
        random = new Random();
        roll();

    }

    // method
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
