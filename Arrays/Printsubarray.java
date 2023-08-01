package Arrays;

public class Printsubarray {
    public static void main(String []args){
         int []arr = {2,4,6,8,10};
         subarray(arr);
         
    }
    static void subarray(int []arr){
        int cs =0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=0;j<arr.length;j++){
                int end = j;
                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                   
                }
                 cs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:"+cs);
    }
    
}
