package lab12_oopAndExceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str =null;
        try {

          String result=   str.repeat(3);
            System.out.println(result);
            System.out.println("try block");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("catch block");
        }

    }
}
