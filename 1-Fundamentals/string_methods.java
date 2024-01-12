public class string_methods {
    public static void main(String[]args){

        String name = "Bro";

        // returns a boolean 
        boolean result = name.equalsIgnoreCase("Bro");

        // returns a number
        int result2 = name.length();

        // returns char
        char result3 = name.charAt(1);

        // returns an index
        int result4 = name.indexOf("o");

        // returns a boolean
        boolean result5 = name.isEmpty();

        // changing case
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();

        // space takeout
        String result8 = name.trim();

        // replacing character
        String result9 = name.replace("o", "a");

        System.out.println(result);




    }
}
