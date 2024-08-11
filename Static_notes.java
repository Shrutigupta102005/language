public class Static_notes {
    public static class info{
        String name ;
         static int age  ;

        public void show(){
            System.out.println(name+","+age);
        }
    }
    public static void main(String[] args){
        info .age =2;
       info obj1 = new info();
       obj1.name= "shruti";
       obj1.age = 19 ;
       obj1.show();

       info obj2 = new info();
       obj2.name= "dhruv";
       obj2.age = 17 ;
       obj2.show();
    }
   }
// static - it is the keyword in java which is used for sharing the common variable ,block,method,classs