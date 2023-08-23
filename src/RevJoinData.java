
import java.util.*;
public class RevJoinData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words with ',' :");
        String word = scan.nextLine();
        String[] arr = word.split(",");
        ArrayList<String> rev= new ArrayList<>();
        for(int i=arr.length-1;i>-1;i--){
            rev.add(arr[i]);
        }
        String words = String.join(".",rev);
        System.out.println(words);
    }


}
