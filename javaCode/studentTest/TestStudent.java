public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Carl Stultz", 11, 3.9, 1001);
        Student s2 = new Student("Ms. Farzinhard", 10, 3.2, 1002);

        System.out.println("Student 1:");
        s1.printStudentInfo();
        System.out.println("Honor Roll: " + s1.isHonorRoll());
        System.out.println();

        System.out.println("Student 2:");
        s2.printStudentInfo();
        System.out.println("Honor Roll: " + s2.isHonorRoll());
    }
}
