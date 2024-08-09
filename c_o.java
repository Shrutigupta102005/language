class calculator{
    public int add(){                 // creating method add
        System.out.println("done");
        return 0;
    }
}

public class c_o {
    public static void main(String[] args){
        calculator calc = new calculator();// creating object 
        int r = calc.add();   
        System.out.println(r);                                //calling method add of class clac
    }
}
