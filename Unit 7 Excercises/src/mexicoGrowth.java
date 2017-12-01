import java.util.Scanner;

public class mexicoGrowth {
    public static final int startYear = 2014;
    public static final double growth = 1.005;
    public static final double startGrowth = 123.8;

    public static void main(String[] args) {
        System.out.println("Type the target population below:");
        Scanner Total = new Scanner(System.in);
        double x = Total.nextDouble();
        int year;
        for (year = startYear; startGrowth * Math.pow(growth, year - startYear) < x; year++) {
        }
        System.out.println("The target population of " + x + " will be achieved in " + year);

       }
    }
