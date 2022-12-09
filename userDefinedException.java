public class userDefinedException {
    public static void main(String[] args) {
        try{
            int x =1;
            throw new myException("123333");
        }catch(myException e){
            System.out.println(e);
        }finally{
            System.out.println("no");
        }
    }
}

class myException extends Exception{
    public myException(String error){
        super(error);
    }
}
