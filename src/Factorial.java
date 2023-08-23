import java.util.*;
public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter a number :");
        Scanner scan = new Scanner(System.in);
        Factorial fun = new Factorial();
        int y = scan.nextInt();
        System.out.println("Factorial of "+y+" is "+fun.func(y));
    }
    public int func(int x){
        int a = 1;
        for(int i=1;i<=x;i++){
            a *= i;
        }
        return a;
    }
}
