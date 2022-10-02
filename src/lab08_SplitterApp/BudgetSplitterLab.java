package lab08_SplitterApp;

import com.sun.source.tree.ArrayTypeTree;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BudgetSplitterLab {
    public static void main(String[] args) {

        System.out.println("Welcome to Budget Planner!");

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you want will split the budget planner ");

        ArrayList<User> userList = prepareUserList(input);

        System.out.println("Added user count : " + userList.size());

        String[] optionList = prepareOptionList();
        while(true) {
            System.out.println("What would you like to do ?");

            for (int i = 0; i < prepareOptionList().length; i++) {
                System.out.println((i + 1) + " : " + optionList[i]);

            }
            int request = input.nextInt();

            switch (request - 1) {
                case 0:

                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }


    public static ArrayList<User> prepareUserList(Scanner input) {
        ArrayList<User> userList = new ArrayList<>();
        int userCount = input.nextInt();
        for (int i = 0; i < userCount; i++) {
            User user = new User();
            System.out.println("Name: ");
            user.name = input.next();
            System.out.println("Email: ");
            user.email = input.next();

            userList.add(user);

        }
        return userList;
    }

    public static String[] prepareOptionList() {
                 /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {"Make Expense", "List Specific Person Expense", "List All Expenses", "Make Split", "List All Users", "Close the budget"};
        return optionList;
    }
}
