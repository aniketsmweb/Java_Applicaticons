package Array;
import java.util.Scanner;

public class MainItemBill {
    public static void main(String[] args) {
        ItemBill b1=new ItemBill();
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter total number of items");
        int size= sc1.nextInt();
        //store items names
        String[]items=new String[size];
        //store items costs
        double[]costs=new double[size];
        System.out.println("enter item Details");
        for(int a=0;a<size;a++){
            System.out.println("enter item name");
            items[a]= sc1.next();
            System.out.println("enter item costs");
            costs[a]=sc1.nextDouble();
        }
        b1.calculateBill(items,costs);

    }
}
