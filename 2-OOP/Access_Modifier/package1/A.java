package Access_Modifier.package1;
import Access_Modifier.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }    
}