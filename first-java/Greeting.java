import java.util.*;

public class Greeting {


    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Hello " + name);

    }
    
}
