import java.lang.Math;
import java.util.Scanner;
class ReverseArray{
    
    
    public int[] reverseArray(int[] arr){
        int n = (int) Math.floor((arr.length/2));
        int len = arr.length;
        for(int i =0; i<n;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        return arr;
    }

    public int[] reverseArray1(int[] arr, int start, int end){

        int temp;
        if (start < end){
            return arr;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray1(arr,start+1,end-1);
        return arr;
    }

    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6};
        
        ReverseArray rs = new ReverseArray();
        int res[] = new int[arr.length];

        System.out.println("#############Iterative Method ###############");
        res = rs.reverseArray(arr);
        printArray(res);

        System.out.println("#############Recursive Method ###############");
        res = rs.reverseArray1(arr,0,arr.length-1);
        printArray(res);

        sc.close();

    }
}