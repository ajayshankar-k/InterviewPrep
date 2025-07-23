
public class LinearSearch {
    public static void main(String[] args) {
        int searchNumber = 4;
     int nums[] = {1,2,3,4,5,6};
     boolean found = false;
     for(int i =0; i<nums.length;i++){
         if(nums[i]==searchNumber){
             System.out.println("found it in index: "+i);
             found = true;
         }
     }
     if(!found){
         System.out.println("Not Found");
     }

    }
}