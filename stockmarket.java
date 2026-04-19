package Arrays;
public class stockmarket {
 public static int profitstock(int price[]){
    int buy=Integer.MAX_VALUE;
    int profit=0;
   // int sell[]=new int[price.length];
    for(int i=0;i<price.length;i++){
      if(buy<price[i]){
        profit=Math.max(price[i]-buy,profit);
      }
      else{
        buy=price[i];
      }

    }
    return profit;
 }
 public static void main(String[] args){
    int price[]={7,1,5,3,6,4};
    System.out.print(profitstock(price));
 }
    
}
