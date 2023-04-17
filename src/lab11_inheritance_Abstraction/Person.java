package lab11_inheritance_Abstraction;

public class Person {
    private String name;
    private int age;
    private final char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'M' || gender == 'F')) {//2. gender can only be set to 'M' or 'F'
            System.err.println("Invalid gender :" + gender);
            System.exit(1);
        }
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //3. name can not be null
        if (name == null) {
            System.err.println("name cannot be null");
            System.exit(1);

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//1. age can not be zero or negative
        if (age <= 0) {
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*scrumTask:
	1. Create a class named Person:
			Variables:
				name, age, gender(final)

			Encapsulate all the fields
				Conditions:
					1. age can not be zero or negative
					2. gender can only be set to 'M' or 'F'
					3. name can not be null

			methods:
				eat(), drink(), sleep(), toString()

	2. Create the subclass of Person named Employee
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

			7. Janitor:

	4. ScrumTeam


	interface ScrumMember
			dailyStandUp();
			gromming();
			sprintPlanning();

	interface WFH:
			hasZoom
			workFromHome();


*/