package File;

import java.io.File;
public class Main {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\zl\\Desktop\\message.txt");
        // Check if a file exists 

        if (file.exists()){

            System.out.println("That file exists! :O");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
        }else{
            System.out.println("That file doesn't exist :(");
        }

    }
}
