package Arrays;
import java.util.*;
public class Reverseanarrayvoid {
    public static void main(String [] args){
        int [] arr= {6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int []arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }

    }
    
}
