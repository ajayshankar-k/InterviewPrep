
import java.util.*;

public class AddNumberItself {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = scan.nextInt();
        int add = 0;

        while(x!=0){
            int dig = x % 10;
            add = add + dig;
            x /= 10;
        }
        System.out.println("Added number :"+add);

    }
}

// code by Ajay Shankar