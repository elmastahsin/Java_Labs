package lab07_ClassObject;
public class TestMETUStudentObjects {
    public static void main(String[] args) {


        METUStudent METUStudent1 = new METUStudent();

        METUStudent1.setInfo("Mike", 30, 'M', true, true, "Java Developer Batch 1", "Java");


        System.out.println(METUStudent1);
        METUStudent METUStudent2 = new METUStudent();
        METUStudent2.setInfo("Naran", 20, 'F', false, false, "Java Developer Batch 2", "Java");


        System.out.println(METUStudent2);
        METUStudent METUStudent3 = new METUStudent();
        METUStudent3.setInfo("Daniel",24,'M', false,true, "Java Developer Batch 2","Java");


        System.out.println(METUStudent3);

        System.out.println("-----------------------------------------------------");

     /*   METUStudent student1 = new METUStudent();
        METUStudent student2 = student1;
        METUStudent student3 = student2;


        student3.setInfo("Naran", 30, 'M', true, true, "Java Developer Batch 1", 2, "Java");


        student3.age = 35;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);*/

    }
}
