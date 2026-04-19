package Arrays;
import java.util.Arrays;

public class mergesorted{
public static int[] mergearray(int a[],int b[]){
  Arrays.sort(a);
  Arrays.sort(b);
    int n=a.length+b.length;
     int i=0,j=0,k=0;
      int c[]=new int[n];
      while(i<a.length && j<b.length){
     if(a[i]==b[j]){
      c[k++]=a[i++];
      j++;
      //c[k++]=b[j++];
      //  it's allow duplicate
     }
     else if(a[i]<b[j]){
        c[k++]=a[i++];
     }
     else{
        c[k++]=b[j++];
     }}
      while(b.length>j && j<=n){
        c[k++]=b[j++];
      }
      while(i<a.length && i<=n){
        c[k++]=a[i++];
      }
     System.out.println(Arrays.toString(c));
     return c;
    }
    public static void main(String[] args){
     int a[]={5,8,6,4,2,9,1};
     int b[]={7,1,9,0,11};
    mergearray(a,b);
    }
}