package lab08_SplitterApp;

import java.util.Scanner;

public class BudgetSplitterLab {
    public static void main(String[] args) {

        System.out.println("Welcome to Budget Planner!");
        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you want will split the budget planner ");
        int userCount = input.nextInt();
        String[] names = new String[userCount];

        for (int i = 0; i < userCount; i++) {
            User user = new User();
            System.out.println("Name: ");
            user.name= input.next();

            System.out.println("Email: ");
            user.email = input.next();
        }


    }
}
