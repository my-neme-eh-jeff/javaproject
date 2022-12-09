package javapracs;
public class errorHandlin {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
        throw new Exception("yoo");
    } catch(Exception e){
        System.out.println(e);
    }
}
}
