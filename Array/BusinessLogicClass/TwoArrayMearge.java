package Array;

public class TwoArrayMearge {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        //int a1= arr1.length;
        //int a2=arr2.length;
        //int c1=a1+a2;
        int[]result =new int[arr1.length+ arr2.length];
        for(int iCnt=0;iCnt< arr1.length;iCnt++){
            result[iCnt]=arr1[iCnt];
        }
        for(int a =0;a< arr2.length;a++){
            result[arr1.length+a]=arr2[a];

        }
        for(int iCnt =0;iCnt< result.length;iCnt++){
            System.out.print(result[iCnt]);
        }



    }
}
