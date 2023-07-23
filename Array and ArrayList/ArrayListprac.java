import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListprac{
    public static void main(String[] args){

        //ArrayList
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        list.add(0, 45);
        list.add(1, 26);
        list.add(2, 45);
        list.add(3, 96);
        list.add(4, 45);
        System.out.println("Initial: "+list);
        list.set(0, 99);
        list.remove(2);
        System.out.println("Updated: "+list); 
        int get=list.get(2);
        System.out.println("Item at index 2: "+get);

    }
}