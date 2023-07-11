public class Task321 {
    public static void main (String[] args) {
        String a = "a bb  ccc          dddd    eeeee";
        char q = ' ';
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length(); i++){
            char b = a.charAt(i);
            if (b == q) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
