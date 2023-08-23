import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = scan.nextLine();
        char[] arr = word.toCharArray();
        String palindrome = "";
        for(int i=arr.length-1;i>-1;i--){
            palindrome += arr[i];
        }
        if(word.equals(palindrome)){
            System.out.println(palindrome+" is a palindrome");
        }else{
            System.out.println(palindrome+" is not a palindrome");
        }
        scan.close();
    }
}
