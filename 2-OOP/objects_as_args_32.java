public class objects_as_args_32 {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car2 car1 = new Car2("BMW");
        Car2 car2 = new Car2("Tesla");

        garage.park(car1);
        garage.park(car2);
    }
}
