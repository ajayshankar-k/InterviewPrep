import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number :");
       int num = scan.nextInt();
       int rev = 0;
       int temp = num;
       while(temp!=0){
           int digit = temp % 10;
           rev = rev * 10 + digit;
           temp /= 10;
       }
       System.out.println(rev);
       System.out.println(temp);
       scan.close();
    }
}

//code by Ajay Shankar