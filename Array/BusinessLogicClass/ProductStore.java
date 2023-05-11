package Array;

public class ProductStore {
    static String[] products ={"AC","LAPTOP","MOBILE"};
    static double[] prices = {40000,35000,20000};
    static int[] stock ={10,15,25};
    public void displayProducts(){
        for(int a=0;a< products.length;a++){
            System.out.println(a+products[a]);
        }
    }
    public void searchProduct(String name){
        boolean found =false;
        for(int a=0;a< products.length;a++){
            if(name.equals(products[a])){
                System.out.println("product name is"+name);
                System.out.println("product price is"+prices[a]);
                System.out.println("product stock is "+stock[a]);
                found = true;
            }
        }
        if(!found){
            System.out.println("product not found");
        }
    }
    public void purchaseProduct(int type,int qty){
        boolean found =false;
        for(int a=0;a<products.length;a++){
            if(type==a && qty<=stock[a]){
                double totalAmt=qty*prices[a];
                System.out.println("total bill amt"+totalAmt);
                stock[a]-=qty;
                System.out.println("available qty is"+stock[a]);
            }
            if(!found){
                System.out.println("product is out of stock ");
            }
        }
    }
}
