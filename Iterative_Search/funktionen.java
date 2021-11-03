package Iterative_Search;

public class funktionen {
  public int rsum;   


    public static void main(String[] args) {
        int test = summe(5);
      System.out.println(test); 
    }


public static int summe(int sum){
   
    if(sum < 1) {
        return 1;
    } else {
        for(int i = sum; i >= 0; i-- ){
            rsum = rsum + sum;
        }
        return sum;
    }
}
}