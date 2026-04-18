package Arrays;

public class matrixsearch {
    public static boolean matrixSearch(int number[][],int key){
      for(int i=0;i<number.length;i++){
         int start=0;int end=number[0].length-1;
        while(start<=end){
             int mid=(start+end)/2;
            if(key==number[i][mid]){
                System.out.println("key at index("+i+","+mid+")");
                return true;
            }
            else if(key>number[i][mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
      }
      System.out.println("key not found");  
      return false;
       // time complexity O(n'2) ,that's why it's perfect
    }
    public static boolean stairSearch(int number[][],int key){
        int row=0;int col=number[0].length-1;
      while(0<=number.length && number[0].length>=0){
       if(key==number[row][col]){
        System.out.println("key at index("+row+","+col+")");
        return true;
      }
      else if(key<number[row][col]){
        col--;
      }
      else{
        row++;
      }}
       return false;
    }
    public static boolean bottomStairSearch(int number[][],int key){
        int row=number.length-1;int col=0;
        while(row>=0 && col<=number[0].length){
         if(key==number[row][col]){
            System.out.println("key at index("+row+","+col+")");
            return true;
         }
         else if(key<number[row][col]){
            row--;
         }
         else{
            col++;
         }
        }
        return false;
    }
    public static void main(String[] args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33; 
        int botton=30;
      matrixSearch(matrix,key);   
      stairSearch(matrix,key); 
      bottomStairSearch(matrix,botton);       
    }
}
