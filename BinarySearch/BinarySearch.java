package BinarySearch;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,9};
        binarySearchAlgo(arr,6);

    }
    static boolean binarySearchAlgo(int[] arr,int target){
        int start=0,end=arr.length-1;
        if(start==0&&end==0){
                System.out.println("Array is emmpty");
                return false;
            }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
             if(target==arr[mid]){
                System.out.println("Element found at index: "+mid);
                return true;
            }
            else if(target<arr[mid]){
                
                end=mid-1;

            }
            else if(target>arr[mid]){
                
                start=mid+1;
            }
            else {
                System.out.println("Element not found");
                return false;
            }
        }
        return false;
    }
    
}
