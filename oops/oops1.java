package oops;

public class oops1{
    // class creation 
    public class student {
      int rollno ;
      String name ;
      int marks;
    }
    public static void main(String[] args){
        oops1 outerInstance = new oops1();
        // object creation 
        oops1.student student1 = outerInstance.new student();
        oops1.student student2 = outerInstance.new student();
        oops1.student student3 = outerInstance.new student();
        // maniuplation of object 
        student1.rollno = 1;
        student1.name = "dhruv";
        student1.marks = 10;

        student2.rollno = 2;
        student2.name = "shubh";
        student2.marks = 20;

        student3.rollno = 3;
        student3.name = "shruti";
        student3.marks = 30;
        System.out.println(student2.name);
        // mainuplation of object using constructor 
        oops1.student student4 = outerInstance.new student(4,"ajay",55);
        
    }
}
/* */