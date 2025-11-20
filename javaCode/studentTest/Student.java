public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private int studentID;

    public Student(String name, int gradeLevel, double gpa, int studentID) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Student ID: " + studentID);
    }

    public boolean isHonorRoll() {
        return gpa > 3.5;
    }
}
