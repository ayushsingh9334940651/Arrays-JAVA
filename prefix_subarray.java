package Arrays;
public class prefix_subarray {
public static void prefix__subarray(int number[]){
  int largest=Integer.MIN_VALUE;
  int prefix[]=new int[number.length];
  prefix[0]=number[0];
  for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+number[i];
    System.out.print(prefix[i]+",");
  }
  System.out.println("");
    for(int i=0;i<prefix.length;i++){
        int sum;
        for(int j=i;j<prefix.length;j++){
          sum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
          largest=Math.max(largest,sum);
        }

        }
        
    
    System.out.println("MAX__"+largest);
 }
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
 prefix__subarray(number);

System.out.println("Kadane's algorithum");
kadane_algorithum(number);
}
}
