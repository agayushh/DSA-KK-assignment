import java.util.Scanner;

public class LargerNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();
        if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
