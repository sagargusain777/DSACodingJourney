package Arrays;

public class SecondLargestelementinarray {
    public static void main(String [] args){
        int [] arr = {3,2,2,1,7,8,6,8,8};
        int selement = secondlargest(arr);
        System.out.println("The Second largest element in the array is: "+ selement);

        
    }
    public static int secondlargest(int[]arr){
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                slargest = largest;
                largest = arr[i];
            }
            else if(largest>arr[i] && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    
}
