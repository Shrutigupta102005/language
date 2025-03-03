public class lec1 {
    public static void main(String[] args) {
        student s = new student(); // object creation
        s.name = "shruti"; // setting the value
        s.age = 18;
        s.Intro_yourself();
        student s1 = new student(); // object creation
        s1.name = "dhruv"; // setting the value
        s1.age = 19;
        s1.Intro_yourself();
       
    }
    
    public static class student { 
        String name;
        int age;
        
        public void Intro_yourself() {
            System.out.println("My name is " + name + " and age is " + age); // Fixed missing spaces and removed extra parenthesis
        }
    }
}