import java.util.Scanner;

public class SumOfTheDegit_005 {

    public static void main(String[] args) {
        SumOfTwoDegit();

    }

    public static void SumOfTwoDegit() {
        {
            int a = 25, n, sum = 0;
                while (a > 0) {
                n = a % 10;
                sum = sum + n;
                a = a / 10;
            }
            System.out.println("Sum of Two Digits is : " + sum);
        }
    }
}



