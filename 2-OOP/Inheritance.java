public class Inheritance {
    public static void main(String[] args) {
        
        Car3 car = new Car3();
        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}

