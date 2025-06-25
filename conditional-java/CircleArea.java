import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        double area = Math.PI * r * r;
        System.out.println("Area of Circle is: " + area);

    }
}