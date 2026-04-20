package Arrays;
import java.util.Arrays;

public class practicearray {
  public static void countingSort(int number[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
      smallest=Math.min(smallest,number[i]);
      largest=Math.max(largest,number[i]);
    }
    int count[]=new int[largest-smallest+1];
    for(int i=0;i<largest-smallest+1;i++){
        count[number[i]-smallest]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
       while(count[i]>0){
       number[j]=i+smallest;
       j++;
       count[i]--;
      }
    }
  }
  
  public static void main(String[] args){
    int number[]={-1,0,1,2,-1,4};
    countingSort(number);
    System.out.println(Arrays.toString(number));
  }
}
