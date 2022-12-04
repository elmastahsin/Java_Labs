package lab11_inheritance_Abstraction;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    void work() {

    }
}
/*	3. BusinessAnalyst
					extra methods:
						analyze(), dailyStandUp(), workFromHome()*/