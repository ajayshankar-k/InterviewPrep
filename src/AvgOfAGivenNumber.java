import java.util.*;
public class AvgOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers in ',' :");
        String num = scan.nextLine();
        String[] numbers = num.split(",");
        ArrayList<Integer> saved= new ArrayList<>();

        for(String i:numbers){
            int number = Integer.parseInt(i);
            saved.add(number);
        }

        int avg = 0;
        int div = 0;
        for(int x:saved){
            avg = avg+x;
            div++;
        }

        int last = avg/div;
        System.out.println("Average of given numbers :"+last);


    }
}

// code by Ajay Shankar
