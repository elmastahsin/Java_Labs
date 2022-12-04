package lab11_inheritance_Abstraction;

public abstract class Employee extends Person { // meant to be inherita
    private final String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null) {
            System.err.println("Job title cannot be null");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    abstract void work(); // meant to be overriden

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", id=" + id +
                ", jobTitle=" + jobTitle +
                ", salary=$" + salary +
                "}";
    }
}
/*	2. Create the subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			extra methods:
				work() (abstract)

			override the toString to include id, jobTitle, salary
			3. Create the following sub classes of the Employee:
			1. Tester
					extra methods:
						createTicket(), dailyStandUp(), workFromHome()

			2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()

			3. BusinessAnalyst
					extra methods:
						analyze(), dailyStandUp(), workFromHome()

			4. ScrumMaster:
					extra methods:
						coaching(), dailyStandUp(), workFromHome()

			5. Teacehr:
					extra methods:
						teach(), workFromHome()

			6. Driver:
					extra methods:
						drive()

			7. Janitor:*/