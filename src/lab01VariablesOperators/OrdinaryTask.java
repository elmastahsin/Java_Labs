package lab01VariablesOperators;

public class OrdinaryTask {
    public static void main(String[] args) {


        double rate = 0.5;
        double delta = 200; // implicit casting
        int result1 = (int) (rate * rate + delta); // explicit casting

        int salary = 500000;
        int bonus = 5000;
        double result2 = 2 * (salary + bonus);

        int time = 50;
        int mass = 100;
        double result3 = 1 / time + 3 * mass;

        double result4 = 1 / (time + (3 * mass));


    }
}
