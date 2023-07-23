package Searching;
import java.util.*;

public class LinearSearch {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int []arr ={12,15,20,15,18,26};
        System.out.println("Please Enter the number to check their index");
        int key = sc.nextInt();
        int  Answer= Searching(arr,key);
        System.out.println("The index of given number is :"+Answer);

    }
    public static int Searching(int[]arr,int key){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        
    }
    
}
