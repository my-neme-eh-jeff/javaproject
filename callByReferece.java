package javapracs;
import java.util.*;

public class callByReferece{
    int number=0;
    public static void main(String args[]){
        callByReferece a = new callByReferece();
        System.out.println("The value of number before is" + a.number);
        increment(a);
        System.out.println("The value of number after is" + a.number);
        
    }

    public static void increment(callByReferece a){
        a.number++;
        System.out.println("The value of number during is" + a.number);
    }
}