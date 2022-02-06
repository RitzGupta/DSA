class sortArray{
    //Dutch Nation Flag
    public int[] sort(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid]==0){
               int temp = arr[mid];
               arr[mid] = arr[low];
               arr[low] = temp;

               low++; mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr;
    }

    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args){
        int arr[] = {1,2,0,1,1,0,0,2,0,1,2,1};
        
        sortArray sa = new sortArray();
        arr = sa.sort(arr);
        printArray(arr);
    }
}