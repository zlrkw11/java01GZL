package File_Writer;

import java.io.FileWriter;
import java.io.IOException;
 

public class Main {
    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("2-OOP\\File_Writer\\poem.txt");
            writer.write("Roses are red");
            writer.close();
        }
        catch(IOException e){

            e.printStackTrace();
        }

    }
}
