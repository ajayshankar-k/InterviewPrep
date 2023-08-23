import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number :");
       int num = scan.nextInt();
       int rev = 0;
       while(num!=0){
           int digit = num % 10;
           rev = rev * 10 + digit;
           num /= 10;
       }
       System.out.println(rev);
       scan.close();
    }
}