package Arrays;
public class subarray {
public static void sub_array(int number[]){
    for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(number[k]+",");
            }
            System.out.println("");
        }
         System.out.println("");
    }
}public static void Add_sub_array(int number[]){
    for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
               sum+=number[k];
            }
            System.out.print(sum+",");
        }
         System.out.println("");
    }
}
    
public static void max_sub_array(int number[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
         for(int j=i;j<number.length;j++){
            int sum=0;
             for(int k=i;k<=j;k++){
               sum+=number[k];
            }
          largest=Math.max(sum,largest);
    }}
    System.out.println(largest);
}
    public static void main(String[] args){
     int number[]={2,4,6,8,10};
     int value[]={1,-1,2,5,-6,8};
     sub_array(number);
     System.out.println("add sub_array");
     Add_sub_array(number);
      System.out.println("MAX of sub_array");
      max_sub_array(value);
    }
}
