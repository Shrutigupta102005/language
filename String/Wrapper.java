package String;

public class Wrapper {
    public static void main(String[] args){
        int a = 9 ;
        Integer a2 = 7;
        System.out.println(a);
        System.out.println(a2);



        // Wrapper class autoboxing unboxing 
        Integer c1 = 18;  // yeh banege cache array meh jis wajha se c1 aur c2 ka output true hoga 
                        // cache meh sirf -128 se 127 tk hi hoga isliye c3 aur c4 false hai 
        Integer c2 = 18;
        Integer c3 = 189;
        Integer c4 = 189;
        System.out.println(c1==c2);
        System.out.println(c3==c4);
    }
}
