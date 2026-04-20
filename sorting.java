package Arrays;
//import java.util.Arrays;
//import java.util.Collections;

import java.util.Arrays;

public class sorting {
    
    public static void bubbleSorting(int number[]){
     for(int i=0;i<number.length-1;i++){
        int swap=0;
        //swap variable is use for reduce unnecessary repeation of loop
        for(int j=0;j<number.length-1-i;j++){
           if(number[j]>number[j+1]){
            int temp=number[j+1];
            number[j+1]=number[j];
            number[j]=temp;
            swap++;
           }
           }
           if(swap==0){
            break;
        }
     }
     for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
     }
    }
    //second type of sorting
    public static void selectionSorting(int number[]){
        for(int i=0;i<number.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<number.length;j++){
                 if(number[minpos]>number[j]){
                    minpos=j;
                 }
            }
         int temp=number[minpos];
          number[minpos]=number[i];
          number[i]=temp;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
     public static void insertSort(int number[]){
        for(int i=1;i<number.length;i++){
            int  pre=i-1;
            while(pre>=0 && number[pre]>number[i]){
                number[i]=number[pre];
                pre--;
            }
            number[pre+1]=number[i];
        }
     }
     public static void countingSort(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            largest=Math.max(largest,number[i]);
        }
        int count[]=new int[largest+1];
       for(int i=0;i<number.length;i++){
           count[number[i]]++;
       } 
       int j=0;
       for(int i=0;i<count.length;i++){
        while(count[i]>0){
            number[j]=i;
            j++;
            count[j]--;
        }
       }
     }

    public static void main(String[] args){
         int num[]={5,3,2,4,1};
       bubbleSorting(num);
        System.out.println(",");
        selectionSorting(num);
        System.out.println(",");
        insertSort(num);
        System.out.println(Arrays.toString(num));
        //Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        //Arrays.sort(num,Collections.reverseOrder());
        //System.out.println(Arrays.toString(num));
        //collection array are object oriandent
        countingSort(num);
        System.out.println(Arrays.toString(num));
    }
}
