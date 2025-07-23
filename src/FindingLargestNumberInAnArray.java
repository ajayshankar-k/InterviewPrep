public class FindingLargestNumberInAnArray {
    public static void main(String[] args){
        int arr[] = {7,8,6,4};
        System.out.println("First Largest:"+firstLargestNumer(arr));
        System.out.println("Second Largest:"+secondLargestNumber(arr));

    }

    public static int firstLargestNumer(int[] arr){
        int largest = arr[0];
        for(int i = 0; i<arr.length;i++){

            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargestNumber(int[] arr){
        int largest =  firstLargestNumer(arr);

        int secondLargest = arr[0];
        for(int i = 0; i<arr.length;i++){

            if(largest<arr[i] && largest!=arr[i]){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
