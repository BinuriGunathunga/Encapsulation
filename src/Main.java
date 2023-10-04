public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Alice");
        student.setAge(14);
        student.setGrade('A');


        System.out.println("Student Information:");
        student.displayInfo();
    }
}
