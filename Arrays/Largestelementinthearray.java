package Arrays;

public class Largestelementinthearray {
    public static void main(String []args){
        int []arr ={10, 324, 45, 90, 9808};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("The Largest number in the array:"+ largest);
    }
    
}
