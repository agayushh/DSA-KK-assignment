import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double d1 = scn.nextDouble();
        double d2 = scn.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of rhombus is" + area);
    }
}
