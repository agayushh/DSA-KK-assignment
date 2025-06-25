import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double b = scn.nextDouble();
        double l = scn.nextDouble();
        double area = b*l;
        System.out.println("Area of rect is" + area);
    }
}
