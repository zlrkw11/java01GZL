import java.util.ArrayList;
public class array_lists {
    public static void main(String[]args){
        // resizable array
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        
        food.set(0, "sushi");
        food.remove(0);
        food.clear();

        for (int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
