package lab11_inheritance_Abstraction;

public final class BusinessAnalyst extends Employee implements ScrumMember, WFH {
    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "BusinessAnalyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " gathering requirement documents");
    }

    public void analyze() {
        System.out.println(getName() + " is analyzing the requirement");

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
/*	3. BusinessAnalyst
					extra methods:
						analyze(), dailyStandUp(), workFromHome()*/