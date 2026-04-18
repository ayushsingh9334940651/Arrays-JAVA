package Arrays;
import java.util.*;
public class searcharray {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static int binarySearch(int number[],int key){
     int start=0,end=number.length-1;
     while(start<=end){
        int mid=(start+end)/2;
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
     }
     return -1;
    }
    
 public static void main(String[] args){
    int number[]={2,4,5,6,7,8,9,12,14,15};
    int key=9;
    Scanner sec=new Scanner(System.in);
    int index=linearSearch(number,key);
    if(index==-1){
        System.out.println("data not found");
    }
    else{
        System.out.println("Key is found at index_"+index);
    }
    //Bineary search part
     System.out.println("Binary half start");
    int B_index=binarySearch(number,key);
    if(B_index==-1){
     System.out.print("data not found");}
     else{
        System.out.println("Key is found at index_"+B_index);}
       sec.close();}
 }

