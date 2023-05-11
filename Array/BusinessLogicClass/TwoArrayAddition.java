package Array;

public class TwoArrayAddition {
    public static void main(String[] args) {
        int []arr1 = {10,20,30};
        int[]arr2 = {40,50,60};
        int[]result= new int[3];
        //for(int iCnt =0;iCnt< arr1.length;iCnt++){
            for(int iCnt=0;iCnt< arr1.length;iCnt++){
                int addition=arr1[iCnt]+arr2[iCnt];
                result[iCnt]=addition;
                System.out.println(result[iCnt]);



            }
        //}
    }
}
