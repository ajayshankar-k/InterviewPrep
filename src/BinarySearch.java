
// spliting arrays into two and search on the array that
// contains the search value the process is repeated until we find the value
//effective in sorted array so sort the array first
// refer: https://youtu.be/jUy5N-3RAjo?si=jqFc_nH8vJTnG6rb

public class BinarySearch {
    public static void main(String[] args){
        int searchNumber = 7;
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = nums.length-1;
        boolean found = false;

        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==searchNumber){
                System.out.println("Number found in index:"+mid);
                found=true;
                break;
            }else if(nums[mid]<searchNumber){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }

    }
}
