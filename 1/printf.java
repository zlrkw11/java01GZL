public class printf {
    public static void main(String[]args){

        System.out.printf("This is a format string %d", 123);
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Ray";
        int myInt = 50; 
        double myDouble = 1000; 

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);


        // width property 
        System.out.printf("Hello %10s", myString);


        // precision
        System.out.printf("You have this much money %.2f", myDouble);
    }
    
}
