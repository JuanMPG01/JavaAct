package Student;

import java.util.ArrayList;

public class Student {
    String studentId;
    String name;
    ArrayList<Integer> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addCal(int grade) {
        grades.add(grade);
    }

    /*

    forma resumida para recorrer una lista
    (int grade : grades)
     sum += grade;

    */

    public double calculateAverage() {
        if (grades.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < grades.size(); i++){
            int grade = grades.get(i);
            sum += grade;
        }
        return (double) sum / grades.size();
    }
// no acceder directamente a las variables sino por los get o set

    public  void details() {
        System.out.println("Student id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Average grade: " + calculateAverage());
    }

    }

