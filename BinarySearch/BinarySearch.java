package BinarySearch;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr={9,8,7,6,5,4,3,2,1};
        int order=orderAgnostic(arr);
        if(order==1){
            int index=reverseBinarySearchAlgo(arr,1);
            System.out.println("Element found at: "+index);
        }
        else{
            int index=normalBinarySearchAlgo(arr,1);
            System.out.println("Element found at: "+index);
        }
        

    }
    static int normalBinarySearchAlgo(int[] arr,int target){
        int start=0,end=arr.length-1;
        if(start==0&&end==0){
                
                return -1;
            }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
             if(target==arr[mid]){
                
                return mid;
            }
            else if(target<arr[mid]){
                
                end=mid-1;

            }
            else if(target>arr[mid]){
                
                start=mid+1;
            }
            else {
               
                return mid;
            }
        }

        return -1;
    }

    static int reverseBinarySearchAlgo(int[] arr,int target){
        int start=0,end=arr.length-1;
        if(start==0&&end==0){
                
                return -1;
            }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
             if(target==arr[mid]){
                
                return mid;
            }
            else if(target<arr[mid]){
                
                
                start=mid+1;

            }
            else if(target>arr[mid]){
                
                end=mid-1;
                
            }
            else {
               
                return mid;
            }
        }

        return -1;
    }

    static int orderAgnostic(int[] arr){

        if(arr[0]>=arr[arr.length-1])
        {
            return 1;
        }
        else
        {
            return 0;
        }
            
        
    }
    
}
