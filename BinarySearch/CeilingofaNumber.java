package BinarySearch;
//Ceiling of a Number =  target<=arr[i]
public class CeilingofaNumber {
    public static void main(String [] args){
        int []arr={1,2,6,8,9,12,14,19,20};
        int target=25;
        int result =ceiling(arr,target);
        System.out.println("The index of the smallest number greater than or equal to target : "+result);


    }
    //Return the index of Smallest number greater than or equal to target||(target<=arr[i]
    public static int ceiling(int []arr,int target){
        //Condition when the target is greater than the greatest element in the array
        // Taking the above example like 25 . It will not exist in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            //Calculating the middle element int the array everytime
            int mid =start+(end-start)/2;
            //Condition if Target is smaller than mid
            if(target<arr[mid]){
                end= mid-1;

            }
            // Condition When the target is greater than mid
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }


        }
        //Returning start  When the array does not contain the Target element
        //In that case we need to give the element greater than target
        //Now when the target will not be found and while condition violates
        //It will be somewhat like this [ end (answer)Target start]
        return start;
    }

}
