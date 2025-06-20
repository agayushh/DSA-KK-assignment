import java.util.*;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float rupees = scn.nextInt();
        double usd = rupees * 86.62;
        System.out.println("usd: " + usd);

    }
    
}
