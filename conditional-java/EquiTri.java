import java.util.Scanner;

public class EquiTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int Perimeter = 3*side;
        System.out.println("Perimeter of triangle is:" + Perimeter);
    }
}