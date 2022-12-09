package javapracs;
import java.util.*;

public class gcdUsingEuclidian {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        
        int gcd =gcd(no1,no2);
        System.out.println(gcd);
    }

    /*
        This is euclidian algorithin and it gives us O( log(min(a,b) ) as time complexity 
        To create an array of objects do 
        <classname> <objname>[] = new <classname>[n] ();
    */
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

