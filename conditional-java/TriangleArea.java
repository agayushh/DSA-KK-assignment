import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double b = scn.nextDouble();
        double h = scn.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("area of triangle is:" + area);

    }
}
