public class Ques1 {
    public static void main(String[] args){
        String[] strings = {
            "apple", "orange", "banana", "grape", "kiwi",
            "mango", "peach", "plum", "berry", "melon"
        };

        for (int i = 0; i < strings.length; i++) {
            strings[i] = replaceVowels(strings[i]);
            System.out.println(strings[i]);
        }
    }

    public static String replaceVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'a': result.append('b'); break;
                case 'e': result.append('f'); break;
                case 'i': result.append('j'); break;
                case 'o': result.append('p'); break;
                case 'u': result.append('v'); break;
                case 'A': result.append('B'); break;
                case 'E': result.append('F'); break;
                case 'I': result.append('J'); break;
                case 'O': result.append('P'); break;
                case 'U': result.append('V'); break;
                default: result.append(ch); break;
            }
        }
        return result.toString();
    }
}