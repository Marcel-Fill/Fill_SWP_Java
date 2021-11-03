package Iterative_Search;

public class funktionen {


    public static void main(String[] args) {
        int test = powfak(2,5);
      System.out.println(test); 
    }


public static int summe(int sum){
   int rsum = 0; 
    if(sum <= 1) {
        return 0;
    } else {
        return sum += summe(sum -1);    //to auto take the number before 

    }
}

public static int fak(int fakt){
    if(fakt <= 1){
        return 1;
    } else {
        return fakt *= fak(fakt -1);
    }
}

public static int powfak(int base, int expo){
    if(expo  <= 1){
        return 1;
    } else {
        return base *= powfak(base,expo -1 );
    }
}
}
