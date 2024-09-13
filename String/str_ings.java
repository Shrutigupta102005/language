public class str_ings {
    public static void main(String[] args) {
        // method 1 to initialise string
        String name = new String("shruti");
        System.out.println(name);

        // method 2  to initialise string 
        String age = "seven";
        System.out.println(age );

                           // methods in java 
        // length in string
        int len = name.length();
        System.out.println(len);
        // lower case and upper case 
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);

        // trim method 
        String spaces = "                 shr  uti       " ;
        System.out.println(spaces.trim());

        //substring method 
        //just initialisation 
        String name2 = name.substring(2);
        System.out.println(name2);
        //initialisations as well as end 
        String name3 = name.substring(2, 4);
        System.out.println(name3);
        // replace method in java 
        String name4 = name.replace('s','d');
        System.out.println(name4);
        //starts with 
        boolean rel = name.startsWith("Sh");  // case sensitive 
        System.out.println(rel);
        //ends with 
        boolean rels = name.endsWith("ti");  // case sensitive 
        System.out.println(rels);

        //charAt
        char letter = name.charAt(3);
        System.out.println(letter);
        //index of 
        int letter2 = name.indexOf("s");
        System.out.println(letter2);
        //last index of 
        int letter3 = name.lastIndexOf("u");
        System.out.println(letter3);
        //last index of 
        String trial = "wejrfdffoifewnfbdfueifn";
        int letter4 = trial.lastIndexOf("f",8);
        System.out.println(letter4);
        // string comparision 
        boolean lala = name.equals("Shruti");
        System.out.println(lala);
        boolean lala2 = name.equalsIgnoreCase("Shruti");
        System.out.println(lala2);


    }
}
// string -- a sequence of char is called string 
/*it is immutable
 * 
 * string is an object of class but since it is used many times it can be accesed as a datatype
 */