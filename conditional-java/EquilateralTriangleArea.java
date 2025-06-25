
import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        double area = (Math.sqrt(3)/4) * a* a;
        System.out.println("Area of equilateral triangle is:" + area);
    }
}
