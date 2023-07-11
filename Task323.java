public class Task323 {
    public static void main (String[] args) {
        String a = "ротор";
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            str1.append(ch1);
        }
        for (int j = a.length() - 1; j >= 0; j--) {
            char ch2 = a.charAt(j);
            str2.append(ch2);
        }
        if (str1.toString().equalsIgnoreCase(String.valueOf(str2))) {
            System.out.println(a + " палиндром");
        }
        else {
            System.out.println(a + " не палиндром");
        }
    }
}
