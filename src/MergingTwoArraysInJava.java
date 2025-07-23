import java.util.Arrays;

public class MergingTwoArraysInJava {
    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,7};

    System.out.println(Arrays.toString(mergeArray(arr1,arr2)));

    }

    public static int[] mergeArray(int[] arr1,int[] arr2){
        int mergedArray[] = new int[arr1.length+arr2.length];
        int index = 0;
        for(int i = 0;i<arr1.length;i++){
            mergedArray[index++] = arr1[i];
        }
        for(int i = 0;i<arr2.length;i++){
            mergedArray[index++] = arr2[i];
        }
        return mergedArray;
    }
}
