import java.util.Random;
public class DiceRoller {
    
    // constructor
    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);

    }

    // method
    void roll(Random random, int number){
        number = random.nextInt()+1;
        System.out.println(number);
    }

}
