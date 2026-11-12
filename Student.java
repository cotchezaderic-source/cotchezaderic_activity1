public class Student {
    // Private instance variables
    private String name;
    private String studentID;
    private double grade;

    // Constructor
    public Student(String name, String studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentID + " | Grade: " + grade);
    }

    // Main method
    public static void main(String[] args) {
        // Step 1: Create two Student objects
        Student student1 = new Student("Juan Dela Cruz", "2026-001", 90.0);
        Student student2 = new Student("Maria Santos", "2026-002", 88.5);

        // Step 2: Change one student's grade using the setter
        student1.setGrade(92.0);

        // Step 3: Call displayInfo() on both students
        student1.displayInfo();
        student2.displayInfo();
    }
}