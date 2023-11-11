public class MaxSal {
    public static double findMax(double[] salaries) {
        double max = salaries[0];

        for (double salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }
}