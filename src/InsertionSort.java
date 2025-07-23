import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {3,4,5,6,1};
        for(int i = 1; i<arr.length;i++){
            int k=arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
}
