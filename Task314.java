import java.util.Arrays;

public class Task314 {
    public static void main (String[] args) {
        String a = "Gfdfd45dsf85sdfsdfg451sdg5464s1df3sg48w64efcs 5 4";
        String[] b = a.split("\\D+");
        int count;
        if (!Character.isDigit(a.charAt(0))) {
            count = -1;
        }
        else {
            count = 0;
        }
        for (int i = 0; i < b.length; i++) {
                count++;
        }
        System.out.println(count);
    }
}
