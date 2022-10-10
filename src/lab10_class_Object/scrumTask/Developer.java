package lab10_class_Object.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;
    private String programmingLanguage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.err.println("Invalide name entry");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.err.println("Invalid Age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.err.println("Invalide job Title entry");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.err.println("Hourly rate cannot be negative");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
        if (!programmingLanguage.contains(programmingLanguage)) {
            System.err.println("Invalid Programming Languages " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public double getSalary() {
        return hourlyRate * 40 * 52;
    }


    public Developer(String name, int age, char gender, String id, String jobTitle, double hourlyRate, String programmingLanguage) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
        setProgrammingLanguage(programmingLanguage);
    }

    public void coding(){
        System.out.println(name + "is coding " +programmingLanguage);
    }
    public void fixingBug(){
        System.out.println(name + "is fixing bugs");
    }
    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
