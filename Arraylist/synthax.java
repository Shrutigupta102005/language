package Arraylist;
import java.util.*;
public class synthax {
    public static void main(String[] args){
        //Creation 
        ArrayList<Integer> list1 = new ArrayList<>();   // 10 size initalise 
        // add element  range 0 to size 
        list1.add(20);
        list1.add(20);
        list1.add(20);
        list1.add(3,45);
        System.out.println(list1);
        // element get  range 0  to size -1 
        System.out.println(list1.get(3));
        //element remove 
        list1.remove(2);                       
        System.out.println(list1);                                                                             
        //element update
        System.out.println(list1.set(1,56));   
        System.out.println(list1);   
        // element sort 
        Collections.sort(list1);
        System.out.println(list1);   
        //display arraylist 
        ArrayList<String> ll = new ArrayList<>();
        ll.add("shruti");
        ll.add("shubh");
        ll.add("dhruv");
        ll.add("ajay");
        ll.add("ruby");
        System.out.println(ll);
        // display with loop 
        for(int i =0 ; i < ll.size();i++){
            System.out.println(ll.get(i));
        }
        // for - each loop   -- reverse not possible in for each loop 
        for(int val:list1){
            System.out.println(val);
        }
        // capacity is kitna rakh sakteh hai 
        // size is kitni roti kahai
    }
}
