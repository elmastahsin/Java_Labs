package lab11_inheritance_Abstraction;

public final class Teacher extends Employee implements WFH {




    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is preaparing class material.");
    }
    public void teach(){
        System.out.println(getName()+ " is teaching");
    }

    @Override
    public boolean hasZoom() {
        return false;
    }

    @Override
    public void workFromHome() {

    }
}
/*
        5. Teacehr:
        extra methods:
        teach(), workFromHome()*/