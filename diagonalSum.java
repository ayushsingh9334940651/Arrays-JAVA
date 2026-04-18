package Arrays;

import java.util.*;

public class diagonalSum {
    public static int diagonalsum(int number[][]){
        int sum=0;
       /* for(int i=0;i<number.length;i++){
            for(int j=0;j<number[0].length;j++){
                if(i==j){
                    sum+=number[i][j];
                }
           
               else if(i+j==number.length-1 && i!=j){
                     sum+=number[i][j]; 
                   }
                 }}*/
        for(int i=0;i<number.length;i++){
            sum+=number[i][i];
            // secondary diagonal
            if(i!=number.length-1-i){
                sum+=number[i][number.length-1-i];
            }
         }    
        return sum;
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
      }
         //System.out.printf(Arrays.toString(matrix));
      System.out.println(diagonalsum(matrix)+"");
    
      sec.close();
    }
}
