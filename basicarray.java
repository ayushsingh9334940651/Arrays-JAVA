package Arrays;
import java.util.*;
public class basicarray{
    public static int largest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<=number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static int smallest(int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest>=number[i]){
                smallest=number[i];
            }
        }
        return smallest;
    }
public static void pair_array(int number[]){
    for(int i=0;i<number.length;i++){
        for(int j=i+1;j<number.length;j++){
            System.out.printf("("+number[i]+","+number[j]+")"); }
        System.out.println("");
    }
}
public static void reverse_array(int number[]){
      int first=0,last=number.length-1;
      while(first<last){
        int temp=number[first];
        number[first]=number[last];
        number[last]=temp;
        first++;
        last--;
      }
    }
public static void main(String[] args){
Scanner sec=new Scanner(System.in);
int number[]=new int[5];
for(int i=0;i<5;i++){
    number[i]=sec.nextInt();
}
System.out.println("Enter Array_");
System.out.println(Arrays.toString(number));
System.out.println("largest___"+largest(number));
System.out.println("smallest___"+smallest(number));
System.out.println("pair__");
pair_array(number);
reverse_array(number);
System.out.println(Arrays.toString(number));
sec.close();
}
}