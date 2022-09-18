package lab07_ClassObject;
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

        System.out.println("-----------------------------------------------------");

     /*   CydeoStudent student1 = new CydeoStudent();
        CydeoStudent student2 = student1;
        CydeoStudent student3 = student2;


        student3.setInfo("Naran", 30, 'M', true, true, "Java Developer Batch 1", 2, "Java");


        student3.age = 35;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);*/

    }
}
