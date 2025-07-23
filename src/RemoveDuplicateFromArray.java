import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6};
        int[] duplicate = new int[arr.length];
        int index = 0;

        for (int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(arr[i]==duplicate[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                duplicate[index++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
