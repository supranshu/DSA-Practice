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
        Scanner sc = new Scanner(System.in);
        System.out.println(rno2[0]);
        System.out.println(arr[0]);
        String[] arrin=new String[6];
        System.out.println("Enter the string values");
        for (int i=0;i<=5;i++)
        {
            
            arrin[i]=sc.next();
            
        }
        for (String string : arrin) //One of the best way to traverse is using fr each loop
        {
            System.out.print(string+" ");
        } 
        System.out.println(Arrays.toString(arrin));//Best way to just traverse using the Arrays class
    } 
}