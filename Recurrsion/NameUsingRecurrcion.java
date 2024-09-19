package Recurrsion;

public class NameUsingRecurrcion {
    int counter = 0;
    public void name(){
        if(counter == 5)
            return ;
        System.out.println("my name is shruti gupta");
        counter += 1;
        name();
    }
    public static void main(String[] args){
        NameUsingRecurrcion obj = new NameUsingRecurrcion();
        obj.name();
    }
}
