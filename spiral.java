package Arrays;
import java.util.*;
public class spiral {
    public static void printSpiral(int number[][]){
    int startrow=0, startcol=0,endrow=number.length-1, endcol=number[0].length-1;
       while(startrow<=endrow && startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            System.out.println(number[startrow][j]);
        }
        if(startrow<endrow){
        for(int i=startrow+1;i<=endrow;i++ ){
            
            System.out.println(number[i][endcol]);
        }}
        if(startcol<endcol){
        for(int j=endcol-1;j>=startcol;j--){
            
            System.out.println(number[endrow][j]);
        }}
        for(int i=endrow-1;i>startrow;i--){
            System.out.print(number[i][startcol]);
        }
        startrow++;
        startcol++;
        endcol--;
        endrow--;
       }
    }
    public static void main(String[] args){
      Scanner sec=new Scanner(System.in);
      System.out.println("enter row and column");
      int n=sec.nextInt();
      int m=sec.nextInt();
      int matrix[][]=new int[n][m];
      System.out.println("enter matrix number");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sec.nextInt();
        }
        //System.out.println("");
      }
      System.out.println(Arrays.toString(matrix));
      printSpiral(matrix);
      sec.close();
    }
}
