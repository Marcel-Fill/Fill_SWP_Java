package Iterative_Search;

public class funktionen {


    public static void main(String[] args) {
       
        long t1 = System.nanoTime() ;
        System.out.println("Iteratives Ergebnis " + IterSum(9000));       
        long t2 = System.nanoTime() ;
        System.out.println("Zeit " + ((t2-t1)/1000) + " mikro s" );
        long t3 = System.nanoTime() ;
        System.out.println("Rekursiv Ergebnis " + summe(9000));       
        long t4 = System.nanoTime() ;
        System.out.println("Zeit " + ((t4-t3)/1000) + " mikro s" );
        long t5 = System.nanoTime() ;
        System.out.println("End Rekursiv Ergebnis " + summeRek(1,9000));       
        long t6 = System.nanoTime() ;
        System.out.println("Zeit " + ((t6-t5)/1000) + " mikro s" );
        
      
    }

    public static long IterSum(long count)
{
    long result = 0; 
    for(int i = 0; i <= count; i++) {
        result += i;
    }
    return result;
}
public static long summe(int sum){
    if(sum < 1) {
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

public static long summeRek(int n, int sum){
     if(sum < 1) {
         return 0;
     } else {
         return sum += summeRek(n + sum, sum -1);    
            //letzter Aufruf immer etwas arithmetisches 
     }
 }

 public static long fakRek(int n,int fakt){
    if(fakt <= 1){
        return 1;
    } else {
        return fakt * fakRek(n*fakt, fakt -1);
    }
}

public static long powfakRek(int n, int base, int expo){
    if(expo == 0){
        return n;
    } else {
        return  powfakRek(base * n, base, expo -1);
    }
}
}
