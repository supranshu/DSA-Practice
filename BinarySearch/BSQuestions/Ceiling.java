package BinarySearch.BSQuestions;

public class Ceiling {
    //Ceilimg= smallest element in array thst is greater than  or equal to the target.

    public static void main(String[] args){
        int[] arr={2,3,5,6,8,9,12,13,14,16,19,21};

        int ans=ceilingNumber(arr,1);
        System.out.println("Ceiling number is: "+ans);
    }
    public static int ceilingNumber(int[] arr,int target){
        int start=0,end=arr.length-1,i=0;
        int[] tar=new int[20];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target)
            {   
                
                start=mid+1;
            }
            else if(arr[mid]>target){
                tar[i++]=arr[mid];
                end=mid-1;

            }
            else{
                break;
            }
            
            
        } 
        int value=smallestNum(tar);     
        return tar[0];

}
    private static int smallestNum(int[] tar) {
        int value=0,i=0;
        
        return tar[i];
    }
}

