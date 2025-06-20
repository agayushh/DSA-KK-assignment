import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = scn.nextInt();
        System.out.print("Enter rate: ");
        int rate = scn.nextInt();
        System.out.print("Enter time: ");
        int time = scn.nextInt();
        int simple_interest = (principle*rate*time)/100;
        System.out.println("Your simple interest is: " + simple_interest);


    }
}
