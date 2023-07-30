package Arrays;
import java.util.*;
public class Secondsmallestelemeninarray{
    public static void main(String []args){
        int []arr = {9,3,2,5,4,1,7};
        int answer = secondelement(arr);
        System.out.println("The Second smallest element in the array is :"+ answer);

    }
    static int secondelement(int[]arr){
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest =smallest;
                smallest = arr[i];
            }
            else if(arr[i]!= smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return smallest;
    }
}