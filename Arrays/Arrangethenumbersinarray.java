package Arrays;
import java.util.*;
//1 3 5 6 4 2

public class Arrangethenumbersinarray {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int []arr= new int[N];
        Arrange(arr,N);
        System.out.println(Arrays.toString(arr));



    }
    static void Arrange(int[]arr,int N){
        if(N%2!=0){ 
              arr[N/2]=N;

        }
        for(int i=0;i<N/2;i++){
            arr[i]=2*i+1;
            arr[N-i-1]=2*i+2;
        }
    }
    
}
