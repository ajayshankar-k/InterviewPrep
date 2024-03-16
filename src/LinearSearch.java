import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        int[] x = {11,45,65,84,56};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find index of :"+Arrays.toString(x));
        int search = scan.nextInt();
        boolean found = false;

        for(int i=0;i<x.length;i++){
            if(search==x[i]){
                System.out.println("The index of "+x[i]+" is "+i);
                found = true;
            }
        }
        if (!found){
            System.out.println("Data not found");
        }
    }
}

// code by Ajay Shankar