public class MinSal {
    public static double findMin (double[] salaries) {
        double min = salaries[0];

        for (double salary : salaries) {
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }
}