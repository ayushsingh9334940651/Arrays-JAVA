package Arrays;
import java.util.*;


public class mutliplication {
    public static void main(String[] args){
        int r1,r2,c1,c2;
      Scanner sec=new Scanner(System.in);
      System.out.println("enter row and column for 1st matrix");
       r1=sec.nextInt();
       c1=sec.nextInt();
      int matrix1[][]=new int[r1][c1];
      System.out.println("enter 1st matrix number");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            matrix1[i][j]=sec.nextInt();
        }
      }
      System.out.println("enter row and column for 2nd matrix");
      r2=sec.nextInt();
      c2=sec.nextInt();
      int matrix2[][]=new int[r2][c2];
      System.out.println("enter 2nd matrix number");
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            matrix2[i][j]=sec.nextInt();
        }
      }
         int mul[][]=new int[r1][c2];
       if(c1!=r2){
        System.out.println("multiplication not possible");
       }
       else{
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                 mul[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
       }
       for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
          System.out.print (mul[i][j]+",");
        }
        System.out.println("");
       }
     
      sec.close();
    }     
}
