import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args){
    int sum = 0;
    int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number here: ");
        int m = sc.nextInt();
        while(m > 0){


            n = m % 10;
            sum = sum + n;
            m = m / 10;



        }
System.out.println("Sum of Digits: " + sum);











    }



}
