public class aboveAvg {
    public static double overAvg(double[] salaries) {
        if (salaries.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }

        double average = sum / salaries.length;

        int count = 0;
        for (double salary : salaries) {
            if (salary > average) {
                count++;
            }
        }

        return count;
    }
}