package Arrays;

public class Uniquenumber {
    public static void main(String []args){
        int []arr ={2,3,1,6,3,6,2};
        int answer =0;
        for(int i=0;i<arr.length;i++){
            answer =answer^arr[i]; //Xor Operator Same element=0;Different elment= 1(element);
        }
        System.out.println("The unique element is :"+ answer);
    }
    
}
