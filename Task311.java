import java.util.Arrays;

public class Task311 {
    public static void main (String[] args) {
        String[] a = {"snakeCase", "toLowerCase", "getBlackTea"};
        System.out.println(Arrays.toString(getSnakeCase(a)));
    }
    public static String[] getSnakeCase(String[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < b.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < a[i].length(); j++) {
                char x = a[i].toCharArray()[j];
                if (Character.isLowerCase(x)) {
                    str.append(x);
                }
                else {
                    str.append("_");
                    str.append(Character.toLowerCase(x));
                }
            }
            b[i] = str.toString();
        }
        return b;
    }
}
