public class overloaded_methods {
    public static void main(String[]args){
        
        // shares the same name, but have different parameters

        double x = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("Overload method #1");
        return a + b;
    
    }

      static int add(int a, int b, int c){
        System.out.println("Overload method #2");
        return a + b + c;
    
    }

    static int add(int a, int b, int c, int d){
        System.out.println("Overload method #3");
        return a + b + c + d;
    
    }

    // double add() methods
    static double add(double a, double b){
        System.out.println("Overload method #4");
        return a + b;
    
    }

    static double add(double a, double b, double c){
        System.out.println("Overload method #5");
        return a + b + c;
    
    }

    static double add(double a, double b, double c, double d){
        System.out.println("Overload method #6");
        return a + b + c + d;
    
    }

}
