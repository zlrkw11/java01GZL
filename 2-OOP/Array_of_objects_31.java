public class Array_of_objects_31 {
    public static void main(String[] args) {
        
        // data types
        //Food[] refrigerator = new Food[3];
        int [] numbers = new int[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");


        // method 2
        Food[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
    }
}
