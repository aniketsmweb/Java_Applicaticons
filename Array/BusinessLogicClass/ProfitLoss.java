
package Array;

public class ProfitLoss {
    public void calculation(int[] purchasePrice, int[] sellingPrice,int initialAmt) {
        int []difference=new int[purchasePrice.length];
        int sum=0;
        for(int a=0;a< purchasePrice.length;a++){
            //difference[a]=purchasePrice[a]+sellingPrice[a];
              difference[a]=sellingPrice[a]-purchasePrice[a];
            sum+=difference[a];
        }

        initialAmt=initialAmt+sum;
        System.out.println("profit is"+sum);


    }
}
