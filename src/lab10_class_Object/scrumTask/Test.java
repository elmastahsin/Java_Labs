package lab10_class_Object.scrumTask;

public class Test {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Mike",18,'M',"A1231","PA",23.32);

        System.out.println(tester1);

        Developer developer1= new Developer("Tyson",23,'M',"A23","Back-end Developer",23.34,"Java");
        System.out.println(developer1);
        developer1.fixingBug();
        developer1.coding();

    }
}
/*Scrum Task:
    1. create a class named Tester
            Variables:
                name, age, gender, employeeID, jobTitle, hourlyRate

            Encapsulate all the fields
                Conditions for setting the fields:
                    1. name can not be set to null/empty/blank
                    2. age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    5. jobTitle can not be set to null/empty/blank
                    6. hourlyRate can not be negative

            Add a constructor that can set all the fields when an object is created

            Methods:
                getSalary(): returns the annual salary
                testing()
                toString()*/