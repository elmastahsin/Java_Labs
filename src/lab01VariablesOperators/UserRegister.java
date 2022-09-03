package lab01VariablesOperators;

public class UserRegister {
    public static void main(String[] args) {
        String firstName = "Mike";
        String lastName = "Smith";
        String monthOfBirth = "May";

        int dateOfBirth = 12;
        int yearOfBirth = 1999;

        boolean isHealthPlanId = true;
        boolean isSSNUmber = false;

        int memberId = 132435657;

        long policyNumber = 1234561245675868L;

        int last6DigitOfSsn = 100000;

        String zipCode = "23434";

        // Mike who born in May wants health insurance form United with policy number 1234561245675868L
        System.out.println(firstName + " who born in" + monthOfBirth + " wants health insurance from United policy number " + policyNumber);

    }
}
