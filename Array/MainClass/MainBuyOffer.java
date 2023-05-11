package Array;
import java.util.Scanner;
public class MainBuyOffer {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        BuyOffer b1=new BuyOffer();
        System.out.println("enter count of items");
        int count=sc1.nextInt();
        double[]cost=new double[count];
        System.out.println("enter cost of items");
        for(int a=0;a<count;a++){
            cost[a]= sc1.nextDouble();
        }
        System.out.println("enter count of items to be considered for billing");
        int qty= sc1.nextInt();
        b1.getBill(cost,qty);

    }
}
