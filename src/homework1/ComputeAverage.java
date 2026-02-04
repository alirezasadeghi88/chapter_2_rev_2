package homework1;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of " + num1 + " " + num2 +
                " " + num3 + " is " + average);
    }
}
