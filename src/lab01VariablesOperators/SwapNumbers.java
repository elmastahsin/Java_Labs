package lab01VariablesOperators;

public class SwapNumbers {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        // int temp = n1;
        // n1 = n2;
        // n2 = temp;


        System.out.println("n1 = " + n1);//20
        System.out.println("n2 = " + n2);//10

        // ANOTHER ANSWER with aritmethic operators;

        n2 = n1 + n2;
        n1 = n2 - n1;
        n2 = n2 - n1;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);


    }
}
