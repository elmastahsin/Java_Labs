package lab11_inheritance_Abstraction;

public class Test {
    public static void main(String[] args) {
        Person person = new Developer("Tyson",23, 'M',"t234","Java Developer",123456);
    person.drink("cola");
Person person1= new Tester("Tyson",23, 'M',"t234","SDET",123456);
((Tester) person1).dailyStandUp();


    }
}
