public class calc2{
    public int add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    public int add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public int add(double n1,int n2){
        System.out.println(n1+n2);
    }
}

public class method_overridding {
    public static void main(String[] args){
        calc2 obj = new calc2();
        calc2.add(1,2,3);
        calc2.add(1,2);
        calc2.add(1.4,2);



    }
}
