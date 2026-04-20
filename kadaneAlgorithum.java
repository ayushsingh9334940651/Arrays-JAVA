package Arrays;

public class kadaneAlgorithum {
    public static void kadane_algorithum(int number[]){
    int largest=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<number.length;i++){
        cs+=number[i];
        if(cs<0){
            cs=0;
        }
        largest=Math.max(cs,largest);
    }
    System.out.println("MAX__"+largest);
 }
public static void main(String[] args){
int number[]={1,-1,2,5,-6,8};
 System.out.println("Kadane's algorithum");
kadane_algorithum(number);
}

}
