import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        double[] salaries = new double[size];

        salaries = salariesIn.salIn(size, salaries);

        double maxSal = MaxSal.findMax(salaries);
        System.out.println("The maximum salary is: " + maxSal);

        double findMin = MinSal.findMin(salaries);
        System.out.println("The minimum salary is: " + findMin);

        double[] avgSum = AvgSum.averageAndSum(salaries);
        double average = avgSum[0];
        double sum = avgSum[1];

        System.out.println("Average Salary: " + average);
        System.out.println("Total Salary: " + sum);

        double aboveAvgCount = aboveAvg.overAvg(salaries);
        System.out.println("Number of salaries above average: " + aboveAvgCount);
    }
}
