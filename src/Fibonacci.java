import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scan.nextInt();
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

    }
}

//code by Ajay Shankar
