import java.util.*;
public class Calci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = scn.nextInt();
        System.out.print("Enter a second number: ");
        int b = scn.nextInt();
        System.out.print("Enter the symbol you wanna perform(+-*/): ");
        char op = scn.next().charAt(0);
        if(op == '+'){
            System.out.print(a+b);
        }
        else if(op == '-'){
            System.out.print(a-b);
        }
        else if(op == '*'){
            System.out.print(a*b);
        }
        else if(op == '/'){
            System.out.print(a/b);
        }
        else{
            System.out.print("invalid input");
        }

    }
}
