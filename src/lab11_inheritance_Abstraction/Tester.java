package lab11_inheritance_Abstraction;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    void work() {

    }
}
/*1. Tester
					extra methods:
						createTicket(), dailyStandUp(), workFromHome()
*/