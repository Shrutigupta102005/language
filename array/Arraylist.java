package array;
import java.util.ArrayList;
import java.util.Collection;
public class Arraylist {
    public static void main(String[] args) {
        // declaration of arraylist 
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        // add elements in arraylist
        list1.add(0);
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        // get elements in arraylist 
        System.out.println(list1.get(3));
        // set elements in arraylist
        list1.set(0,100);
        //add element in between 
        list1.add(2,20000);
        //to known the size of the arraylist 
        System.out.println(list1.size());
        // deleting an items 
        list1.remove();
        System.out.println(list1);
    }
}
