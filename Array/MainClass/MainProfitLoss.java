package Array;
import java.util.Scanner;
public class MainProfitLoss {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        ProfitLoss p1=new ProfitLoss();
        System.out.println("enter count of items");
        int size= sc1.nextInt();
        System.out.println("enter initial amount");
        int initialAmt= sc1.nextInt();
        int[]purchasePrice=new int[size];
        int[]sellingPrice=new int[size];

        for(int a=0;a<size;a++){
            System.out.println("enter Purchase Price");
            purchasePrice[a]= sc1.nextInt();
            System.out.println("enter selling price");
            sellingPrice[a]=sc1.nextInt();
        }
        p1.calculation(purchasePrice,sellingPrice,initialAmt);

    }
}
