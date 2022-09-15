package lab07_ClassObject;

import java.io.StringReader;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {


        CydeoStudent cydeoStudent1 = new CydeoStudent();

        cydeoStudent1.setInfo("Mike", 30, 'M', true, true, "Java Developer Batch 1", "Java");


        System.out.println(cydeoStudent1);
        CydeoStudent cydeoStudent2 = new CydeoStudent();
        cydeoStudent2.setInfo("Naran", 20, 'F', false, false, "Java Developer Batch 2", "Java");


        System.out.println(cydeoStudent2);
        CydeoStudent cydeoStudent3 = new CydeoStudent();
        cydeoStudent3.setInfo("Daniel",24,'M', false,true, "Java Developer Batch 2","Java");


        System.out.println(cydeoStudent3);


    }
}
