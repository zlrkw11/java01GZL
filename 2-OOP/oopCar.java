public class oopCar {
    public static void main(String[]args){
        
        // creating objects using class
        car myCar1 = new car();
        car myCar2 = new car();

        
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        
        myCar1.drive();
        myCar1.brake();

    }
}
