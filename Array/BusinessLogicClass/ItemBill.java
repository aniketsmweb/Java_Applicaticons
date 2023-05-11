package Array;

public class ItemBill {
    public double[] calculateGstAmount(double[] costs){
        double[] gstAmounts=new double[costs.length];
        for(int a=0;a< costs.length;a++){
            if(costs[a]<500){
                gstAmounts[a]=costs[a]*0.05;
            }
            else {
                gstAmounts[a]=costs[a]*0.1;
            }
        }
        return gstAmounts;
    }
    public void calculateBill(String[] items, double[] costs) {
        double[]gstAmounts=calculateGstAmount(costs);
        //create array to store final amount
        double[]finalAmounts=new double[items.length];
        //perform addition of gst amount and origional cost
        for(int a=0;a< items.length;a++){
            finalAmounts[a]=costs[a]+gstAmounts[a];
        }
        //declare variables to store total amounts
        double totalItemCost=0.0;
        double totalGstAmount=0.0;
        double totalFinalAmount=0.0;
        //calculate total amounts
        for(int a=0;a<items.length;a++){
            totalItemCost+=costs[a];
            totalGstAmount+=gstAmounts[a];
            totalFinalAmount+=finalAmounts[a];
        }
        //display is given format
        System.out.println("NAME\t\tCOST\t\tFINAL");
        System.out.println("===========================================================");
        for(int a=0;a<items.length;a++){
            System.out.println((items[a]+"\t"+costs[a]+"\t"+gstAmounts[a]+"\t"+finalAmounts[a]));
        }
        System.out.println("=============================================================");
        System.out.println("TOTAL"+"\t"+totalItemCost+"\t"+totalGstAmount+"\t"+totalFinalAmount);
    }




}
