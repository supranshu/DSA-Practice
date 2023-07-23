package LinearSearch;

public class LinearSearch{
    public static void main(String[] args){
        int[] arr={2,55,3,89,15,23,487,216,72,189};

        // Normal Linear search


        System.out.println(linearSerch(arr,23));


        // Search in Strings

        String str="Supranshu";
        System.out.println(searchString(str,'h'));

        // Linear Search in Range

        System.out.println(linearInRange(arr,72,3,9));


        // Search in 2d Array

        int [][] arr2d={{1,2,3},{7,8,9},{4,5,6,14},{89,36}};
        System.out.println(search2dArray(arr2d,89));


        //Q: Problem to find how many elements in the array has even number of digits
        int evenDigitsNumber=evenDigits(arr);
        System.out.println("There are "+evenDigitsNumber+" elements of even digits in array");


        //Q: Find max wealth of a person from array, where wealth is addition of all elements in a dimension of array

        int maxWealthPerson=maxWealth(arr2d);
        System.out.println("Max wealth is "+maxWealthPerson);
        
    }

    private static int maxWealth(int[][] arr2d) {
        //person=row, account=col
        int maxsum=Integer.MIN_VALUE;
        for(int person=0;person<arr2d.length;person++){
            int rowsum=0;
             //when you start a new coloumn
            for(int account=0;account<arr2d[person].length;account++){
                rowsum+=arr2d[person][account];
            }
            //check with the main/overall answer
            if(rowsum>maxsum){
                maxsum=rowsum;
            }
        }
        
        return maxsum;
    }

    private static int evenDigits(int[] arr) {

        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // Function to check whether a number is even or not
    private static boolean even(int num) {
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        if(count%2==0){
            return true;
        }
        else{
            return false;
        }
        
    }

    private static String search2dArray(int[][] arr2d, int target) {
        if(arr2d.length==0){
            return "Array is empty";
        }
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col<arr2d[row].length;col++){
                if(arr2d[row][col]==target){
                    return "Found at "+row+","+col;
                }
            }
        }


        return "Not Found";
    }

    private static String linearInRange(int[] arr, int target, int low, int high) {
        if(high>arr.length){
            return "Out of bound range";
        }
        for(int i=low;i<=high;i++){
            if(arr[i]==target){
                return "Found at "+i;
            }
        }

        return "Not Found";
    }

    private static String linearSerch(int[] arr, int value) {

        if(arr.length==0){
            return "Array is empty";
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return "Found at "+i;
            }

        }
        return "Not found";
    }
    private static String searchString(String str,char target){
        if(str.length()==0){
            return "String is empty";
        }
        
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return "Found at "+i;
            }
            
        }
        
        return "Not Found";

    }
}