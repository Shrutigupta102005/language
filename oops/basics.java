package oops;

public class basics {
    public static void main(String[] args){
        // creation of a object 
        Student shruti = new Student() ;
        System.out.println(shruti.name);
        System.out.println(shruti.age);
        shruti.name = "Shruti";
        shruti.intro_yourself();
        shruti.intro_yourself("dhruv");
    }
    // creation of a class
    public static class Student{
        String name;
        int age;

        public void intro_yourself(){
            System.out.println("hey wait this is a function or you can call me a method which is made by  shruti gupta understand ...."+name);
        }
        // use of this keyword
        public void intro_yourself(String name){
            System.out.println("hey wait this is a function or you can call me a method which is made by  shruti gupta understand ...."+name+this.name);
        }

    }
}
