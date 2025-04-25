package Student;

public class mainStudent{
public static void main(String[] args) {

    Student student1 = new Student("01", "Juan Miguel");
    Student student2 = new Student("02", "Carlos Peña");

    student1.addCal(5);
    student1.addCal(4);
    student1.addCal(4);

    student2.addCal(3);
    student2.addCal(5);
    student2.addCal(5);

    System.out.println("Student one details:");
    student1.details();

    System.out.println("Student two details:");
    student2.details();

}
}