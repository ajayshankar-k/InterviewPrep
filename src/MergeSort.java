import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int arr[] ={8,7,1,6,5,3,9};

        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left,int right){

        int mid = (left+right)/2;
        if(left<right){
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for(int x=0;x<n1;x++){
            leftArr[x] = arr[left+x];
        }
        for(int y=0;y<n2;y++){
            rightArr[y]=arr[mid+1+y];
        }
        int i =0;
        int j =0;
        int k =left;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
