package Searching;

public class BinarySearch {
    public static void main(String []args){
        int []arr = {2,5,8,10,15,20,30,55,75}; // Prrequisite = Sorted array
        int target = 30;
        int answer = binarySearch(arr,target);
        System.out.println("The index of the given number is :"+ answer);
    }
    static int binarySearch(int[]arr,int target){
          int start =0;
          int end = arr.length-1;
          while(start<=end){
            //Find the middle element
            //int mid = (start+end)/2; //might be possible that (start+end) exceeds the range of integer in java
            int mid = start+(end-start)/2; //Better way
            if(target < arr[mid]){
                 end =mid -1;
            }
            else if(target >arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
          }
          return -1;
    }
    
}
