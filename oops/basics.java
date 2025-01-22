package oops;

public class basics {
    public static void main(String[] args){
        // creation of a object 
        Student shruti = new Student() ;
        System.out.println(shruti.name);
        System.out.println(shruti.age);
        shruti.intro_yourself();
    }
    // creation of a class
    public static class Student{
        String name;
        int age;

        public void intro_yourself(){
            System.out.println("hey wait this is a function or you can call me a method which is made by  shruti gupta understand ....");
        }
    }
}
