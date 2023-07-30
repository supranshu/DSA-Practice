package BinarySearch.BSQuestions;

public class Ceiling {
    //Ceilimg= smallest element in array thst is greater than  or equal to the target.

    public static void main(String[] args){
        int[] arr={2,3,5,6,8,9,12,13,14,16,19,21};

        int ans=ceilingNumber(arr,20);
        int ans1=floorNumber(arr,20);
        System.out.println("Ceiling number is: "+ans);
        System.out.println("Floor number is: "+ans1);
    }
    private static int floorNumber(int[] arr, int target) {
        int start=0,end=arr.length-1,i=0;
        int[] tar=new int[20];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {   
                
                end=mid-1;
            }
            else if(target>arr[mid]){
                
                start=mid+1;

            }
            else{
                break;
            }
            
            
        } 
           
        return arr[end];
    }
    public static int ceilingNumber(int[] arr,int target){
        int start=0,end=arr.length-1,i=0;
        int[] tar=new int[20];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {   
                
                end=mid-1;
            }
            else if(target>arr[mid]){
                
                start=mid+1;

            }
            else{
                break;
            }
            
            
        } 
           
        return arr[start];

    }
  
}

