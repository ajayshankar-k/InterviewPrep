import java.util.*;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();

        int perfect = 0;
        for(int i=1;i<num;i++){
            if(num % i ==0){
                perfect = perfect + i;
            }
        }
        if(perfect==num){
            System.out.println(num+" is a perfect number.");
        }else{
            System.out.println(num+" is not a perfect number.");
        }
    }
}

//code by Ajay Shankar