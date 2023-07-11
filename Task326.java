public class Task326 {
    public static void main (String[] args) {
        String a = "a b c d";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            str.append(ch);
            str.append(ch);
        }
        System.out.println(str);
    }
}
