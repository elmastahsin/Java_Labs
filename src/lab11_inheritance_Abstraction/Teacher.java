package lab11_inheritance_Abstraction;

public class Teacher extends Employee{




    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    void work() {

    }
}
/*
        5. Teacehr:
        extra methods:
        teach(), workFromHome()*/