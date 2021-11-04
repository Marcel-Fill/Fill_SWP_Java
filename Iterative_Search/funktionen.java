package Iterative_Search;

public class funktionen {


    public static void main(String[] args) {
        long test = summe(10000);
      System.out.println(test); 
    }


public static long summe(int sum){
   int rsum = 0; 
    if(sum <= 1) {
        return 0;
    } else {
        return sum + summe(sum -1);    

    }
}

public static long fak(int fakt){
    if(fakt <= 1){
        return 1;
    } else {
        return fakt *= fak(fakt -1);
    }
}

public static long powfak(int base, int expo){
    if(expo  <= 1){
        return 1;
    } else {
        return base *= powfak(base,expo -1 );
    }
}
}
