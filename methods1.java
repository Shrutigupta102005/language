class station{
    public String give_me_pen(int cost)
    {
        return "pen";
    }
}
public class methods1 {
    public static void main(String[] args){
       station shop = new station();
       String sh =shop.give_me_pen(10);
       System.out.println(sh);
    }
}
