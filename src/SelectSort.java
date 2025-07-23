import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args){
        int[] num = {3,4,7,1,8};
        System.out.println(Arrays.toString(sortedArray(num)));
    }

    public static int[] sortedArray(int[] num){
        int temp = 0;
        for(int i=0;i<num.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<num.length;j++){
                if(num[minIndex]>num[j]){
                    minIndex=j;
                }
            }
            temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
    return num;
    }
}
