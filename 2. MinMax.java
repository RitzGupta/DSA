class MinMax {
    
    public int[] minmax(int [] arr){
        int res[] = new int[2];

        int min,max;

        if(arr.length==1){
            res[0] = arr[0];
            res[1] = arr[0];
            return res;
        }
        min = arr[0];
        max = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            else if(max<arr[i]){
                max = arr[i];
            }
        }

        res[0] = min;
        res[1] = max;
        
        return res;

    }

    public static void main(String [] args){
        int arr[] = {1,22,13,43,5,6};
        
        MinMax mm = new MinMax();
        
        int res [] = new int[2];
        res = mm.minmax(arr);

        System.out.println("Min: "+ res[0]);
        System.out.println("Max: "+ res[1]);
    }
}
