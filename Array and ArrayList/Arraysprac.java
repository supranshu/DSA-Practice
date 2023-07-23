import java.util.Arrays;
import java.util.Scanner;

public class Arraysprac
{
    // syntax
    // datatype[] variable=new datatype[size];
    //e.g: store 5 roll numbers
    static int[] rno=new int[5];//actually here the object is created and memory is allocated(runtime)
    static int[] rno2={23,12,54,2,50};
    static String[] arr={"hello","e","l","l","o"};
    //it totally depends on jvm to keep it continous or not, its not mandatory that they will be continous, because they are heap objects


    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println(rno2[0]);
        // System.out.println(arr[0]);
        // String[] arrin=new String[6];
        // System.out.println("Enter the string values");
        // for (int i=0;i<=5;i++)
        // {
            
        //     arrin[i]=sc.next();
            
        // }
        // for (String string : arrin) //One of the best way to traverse is using fr each loop
        // {
        //     System.out.print(string+" ");
        // } 
        // System.out.println(Arrays.toString(arrin));//Best way to just traverse using the Arrays class

        // int[][] arr2d={{1,2,3,4},{5,6},{7,8,9}};//here no. of coloumns is not fixed
        // for(int row=0;row<arr2d.length;row++){
        //     for(int col=0;col<arr2d[row].length;col++){
        //         System.out.print(arr2d[row][col]);
        //     }
        //     System.out.println();
        // }

        // SWAPPING

        int[] arr1={1,2,25,4,5};
        swap(arr1,1,3);
        System.out.println(Arrays.toString(arr1));


        // MAXIMUM ITEM

        System.out.println(max(arr1));

        //  REVERSE

        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
       
    }


    private static void reverse(int[] arr) {

        int start,end;
        start=0;
        end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    private static int max(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    
    

   
}