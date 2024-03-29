package lab10_class_Object.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester[] testers = {
                new Tester("Josh", 35, 'M', "A1", "QA", 45),
                new Tester("Emily", 30, 'F', "A2", "SDET", 42),
                new Tester("Bella", 38, 'F', "A3", "QE", 48),
        };

        Developer[] developers = {
                new Developer("Shukur", 28, 'M', "B1", "Front-End Developer", 50, "Java"),
                new Developer("Marika", 27, 'F', "B2", "Back-End Developer", 51, "Python"),
                new Developer("Umran", 30, 'F', "B3", "Full stack Developer", 55, "C#"),
                new Developer("Diana", 28, 'F', "B4", "Software Developer", 50, "Java")
        };

        ScrumTeam scrumTeam = new ScrumTeam("Bilal", "Hasan", "Lucy", 14);
        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);
        System.out.println(scrumTeam);


        System.out.println("--------------------------------------------------------");
        System.out.println("Testers: ");
        for (Tester eachTester : scrumTeam.getTester()) {
            System.out.println("\t"+eachTester.getName() +"\t : $"+eachTester.getSalary());
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Developers: ");
        for (Developer eachDeveloper : scrumTeam.getDevelopers()) {
            System.out.println("\t" + eachDeveloper.getName() +"\t : $"+ eachDeveloper.getSalary());
        }


    }
}
