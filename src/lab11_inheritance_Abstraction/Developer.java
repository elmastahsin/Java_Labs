package lab11_inheritance_Abstraction;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    void work() {

    }
}
/*2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()
*/