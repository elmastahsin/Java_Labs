package lab11_inheritance_Abstraction;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    void work() {

    }
}
/*	4. ScrumMaster:
					extra methods:
						coaching(), dailyStandUp(), workFromHome()*/