package pw_35.CWD;

public class CWDString {
    public static void main(String[] args){
        ques1();
        ques2();
        ques3();
        ques4();
        ques5();

    }
    //ques1 convert string to lower case  
    static void ques1(){
        String name = "SHRUTI";
        String name2 = name.toLowerCase();
        System.out.println(name2);
    }
    //ques2 replace spaces with underscore
    static void ques2(){
        String name = " S HRUT  I  ";
        String name2 = name.replace(' ','_');
        System.out.println(name2);
    }
    /*ques3 write a java program to fill in a letter template which looks like below:
    letter = "Dear <|name|>,Trans a lot"
    replace <|name|> with a string(sone name)
    */
    static void ques3(){
        String letter = "Dear <|name|>,Trans a lot";
        String letter2 = letter.replace(" <|name|>","shruti");
        System.out.println(letter2);
    }
    //ques4 write a java program to detect double and triple places in java 
    static void ques4(){
        String letter = "hello  shruti    cnvjnfc    njfncvn  ";
        System.out.println(letter.indexOf("   "));
        System.out.println(letter.indexOf("  "));

    }
    // ques5 write a java program to format the following letter using escape sequence char
    // letter = "Dear harry,this java course is nice thanks "
    static void ques5(){
        String letter = "Dear harry,this java course is nice thanks ";
        System.out.println(letter);
    }
}
