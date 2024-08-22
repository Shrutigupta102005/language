class A
{
    public void show()
    {
        System.out.println("Shruti's kingdom ");
    }
}

public class AnomynousObj {
    public static void main(String[] args){
        new A(); // anomynous object 
    }
}
// anomynous object -- created in only heap memory not in stack can't be reused just for one time use .
//referenced object -- one which has its var_anme stored in sstack memory and value in heap mempry .