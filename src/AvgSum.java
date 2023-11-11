public class AvgSum {
    public static double[] averageAndSum(double[] salaries) {
        double[] result = new double[2];

        double sum = 0;
        for (double counter : salaries) {
            sum += counter;
        }

        double average = sum / salaries.length;

        result[0] = average;
        result[1] = sum;

        return result;
    }
}
