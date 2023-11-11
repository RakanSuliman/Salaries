import java.util.Scanner;

public class salariesIn {
    public static double[] salIn(int size, double[] salaries) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter salary No." + (i + 1));
            salaries[i] = input.nextDouble();
        }

        return salaries;
    }
}