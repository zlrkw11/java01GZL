public class method {
    public static void main(String[]args){

        // parameter call
        String name = "Ray";
        int age = 19;
        hello(name, age);


        // add method
        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);

        System.out.println(add(x, y));


    }

    // individual hello method
    static void hello(String name, int age){
        System.out.println("Hello " +name);
        System.out.println("You are "+age);

    }

    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}

