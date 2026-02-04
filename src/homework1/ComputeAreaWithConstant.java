package homework1;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = scanner.nextDouble();

        double area = radius * radius * PI;

        System.out.println(area);
    }
}
