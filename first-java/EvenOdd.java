
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even");

        }
        else{
            System.out.println("Number is odd");
        }
    }
}