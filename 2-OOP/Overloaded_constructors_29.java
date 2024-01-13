public class Overloaded_constructors_29 {
    public static void main(String[] args) {

        // new pizza object
        Pizza pizza = new Pizza("thick crust", "tomato","mozerella","pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    
    }
}
