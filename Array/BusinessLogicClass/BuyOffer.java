package Array;

public class BuyOffer {
    public void getBill(double[] cost, int qty) {
        //sort the array in decending order
        double minValue=0.0;

        for(int a=0;a<cost.length;a++){
            for(int b=a+1;b< cost.length;b++){
                if(cost[a]<cost[b]){
                    minValue=cost[a];
                    cost[a]=cost[b];
                    cost[b]=minValue;
                }
            }
        }
        //calculate total bill amount
        double totalBill=0.0;
        for(int a=0;a< cost.length;a++){
            totalBill+=cost[a];
        }
        //calculate discounted bill amount
        double discountedAmount=0.0;
        for(int a=0;a<qty;a++){
            discountedAmount+=cost[a];
        }
        System.out.println("total bill amont"+totalBill);
        System.out.println("discounted bill amount "+discountedAmount);
        System.out.println("final amount with gst "+(discountedAmount+discountedAmount*0.12));
    }
}
