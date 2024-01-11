import java.util.ArrayList;
public class for_each_loop {
    public static void main(String[]args){
       
        // array
        String [] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("rat");
        animals2.add("bird");

        // for each loop 
        for (String i : animals2) {
            System.out.println(i);
        }
    }
}
