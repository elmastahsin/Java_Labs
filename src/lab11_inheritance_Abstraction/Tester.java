package lab11_inheritance_Abstraction;

public final class Tester extends Employee implements ScrumMember,WFH{
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
   public void work() {
        System.out.println(getName() + " is testing the application");
    }
    public void createTicket(){
        System.out.println(getName()+ " is creating ticket");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName() + " is ");
    }

    @Override
    public void gromming() {
        System.out.println(getName() + " is ");
    }

    @Override
    public void sprintPlanning() {
        System.out.println(getName() + " is ");
    }

    @Override
    public boolean hasZoom() {
        return false;
    }

    @Override
    public void workFromHome() {

    }
}
/*1. Tester
					extra methods:
						createTicket(), dailyStandUp(), workFromHome()
*/