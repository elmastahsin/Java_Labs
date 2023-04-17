package lab12_oopAndExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {
    public static void main(String[] args) throws FileNotFoundException {
        String str =null;
        try {

          String result=   str.repeat(3);
            System.out.println(result);
            System.out.println("try block");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("catch block");
            str ="Java";
            String result = str.repeat(3);
            System.out.println(result);
        }

        System.out.println("-----------------------------");


            new FileInputStream("src/lab12_oopAndExceptions/lab 12 class notes");

    }
    public void method1()throws FileNotFoundException{
        new FileInputStream("src/lab12_oopAndExceptions/lab 12 class notes");

    }
    public void method2(){
        //method1();
    }
    public void method3(){
        try {
            new FileInputStream("src/lab12_oopAndExceptions/lab 12 class notes");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void method4(){
        method3();
    }
}
