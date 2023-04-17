package lab11_inheritance_Abstraction;

public class Developer extends Employee implements ScrumMember,WFH{
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }
    public void fixBug(){
        System.out.println(getName() + " is fixing bugs");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void gromming() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public boolean hasZoom() {
        return false;
    }

    @Override
    public void workFromHome() {

    }
}
/*2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()
*/