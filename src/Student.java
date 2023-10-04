public class Student {
    private String name;
    private int age;
    private char grade;
    public String getName() {

        return name;
    }
    public void setName(String Name) {

        this.name = Name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public char getGrade() {

        return grade;
    }

    public void setGrade(char Grade) {

        this.grade = Grade;
    }
    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

}
