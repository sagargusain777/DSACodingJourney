package Arrays;
public class Reverseanarray{
    public static int [] Reverse(int[]arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return arr;
        
    }
    public static void main(String[]args){
        int []arr ={1,2,3,4,5,6};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    

    }
}