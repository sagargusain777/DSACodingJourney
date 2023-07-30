package Arrays;

public class Checkifthearrayissorted {
    public static void main(String [] args){
        int []arr ={1,2,2,4,4,5,6,6};
        boolean answer = sorted(arr);
        System.out.println("The array is  sorted :"+ answer);

    }
    static boolean sorted(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]) //2 is greater than one
            {

            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
