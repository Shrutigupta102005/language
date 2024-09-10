package oops;

public class oops1 {
    // Inner class creation
    public class student {
        int rollno;
        String name;
        int marks;

        // Constructor for the student class
        public student(int rollno, String name, int marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        oops1 outerInstance = new oops1();

        // Create instances of the inner class
        oops1.student student1 = outerInstance.new student(1, "dhruv", 10);
        oops1.student student2 = outerInstance.new student(2, "shubh", 20);
        oops1.student student3 = outerInstance.new student(3, "shruti", 30);

        // Print student details
        System.out.println("Student 1: Roll No=" + student1.rollno + ", Name=" + student1.name + ", Marks=" + student1.marks);
        System.out.println("Student 2: Roll No=" + student2.rollno + ", Name=" + student2.name + ", Marks=" + student2.marks);
        System.out.println("Student 3: Roll No=" + student3.rollno + ", Name=" + student3.name + ", Marks=" + student3.marks);

        // Create an instance of the inner class using the constructor
        oops1.student student4 = outerInstance.new student(4, "ajay", 55);
        System.out.println("Student 4: Roll No=" + student4.rollno + ", Name=" + student4.name + ", Marks=" + student4.marks);
    }
}
