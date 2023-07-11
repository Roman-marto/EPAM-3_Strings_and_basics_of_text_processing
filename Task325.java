public class Task325 {
    public static void main (String[] args) {
        String a = "Let’s play football outside";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            if (t == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
