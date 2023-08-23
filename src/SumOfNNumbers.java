
import java.util.*;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();
        int sum =  num*(num+1)/2;

        System.out.println("Sum of n Natural Number :" + sum);

    }
}
