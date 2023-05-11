//wap to perfrom additoon of all the even numebrs present between 1 to 20

package forloop;
public class ForLoopDemo4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int iCnt = 1;iCnt<=20;iCnt++){
            if((iCnt%2)==0){
                sum = sum + iCnt;
            }
        }
        System.out.println(sum);
    }
}