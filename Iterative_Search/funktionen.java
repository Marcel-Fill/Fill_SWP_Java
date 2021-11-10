package Iterative_Search;

public class funktionen {


    public static void main(String[] args) {
       
        long t1 = System.nanoTime() ;
        System.out.println("Iteratives Ergebnis " + IterSum(7));       
        long t2 = System.nanoTime() ;
        System.out.println("Die Zeit für die Iterative Berechnung liegt bei " + ((t2-t1)/1000) + "ms" );
        long t3 = System.nanoTime() ;
        System.out.println("Iteratives Ergebnis " + summe(7));       
        long t4 = System.nanoTime() ;
        System.out.println("Die Zeit für die Rekursive Berechnung liegt bei " + ((t4-t3)/1000) + "ms" );
        long t5 = System.nanoTime() ;
        System.out.println("Iteratives Ergebnis " + summeRek(1,7));       
        long t6 = System.nanoTime() ;
        System.out.println("Die Zeit für die END-Rekursive Berechnung liegt bei " + ((t6-t5)/1000) + "ms" );
        
      
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
