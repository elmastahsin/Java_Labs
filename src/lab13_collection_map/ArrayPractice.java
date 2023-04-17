package lab13_collection_map;

import lab12_oopAndExceptions.restaurantTask.Chef;
import lab12_oopAndExceptions.restaurantTask.Employee;
import lab12_oopAndExceptions.restaurantTask.Server;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 10;
        array[2] = 10;
        array = new int[5];

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------");

        int[] scores = {10, 20, 30, 49};
        System.out.println("----------------------------------");

        Employee[] employees = {
                new Server("Emily", 35, 'F', "A01", 55000),
                new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000)
        };

    }
}
