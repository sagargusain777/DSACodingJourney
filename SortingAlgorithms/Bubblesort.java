package SORTINGALORITHMS;
import java.util.*;
public class Bubblesort{
    public static void SortingBubble(int [] arr){
        //loop for number of passes;Since we know number of passes will be n-1
        for(int i=0;i<arr.length-1;i++){
            //loop for arranging the elements in ascending order
            //largest element at last index
            for(int j=1;j<arr.length-i;j++){
                //Conditon
                if(arr[j]<arr[j-1]){
                    //Swap Function
                    int temp =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int []arr = { 64, 34, 25, 12, 22, 11, 90 };
        SortingBubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
