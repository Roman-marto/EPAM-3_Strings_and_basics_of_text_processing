import java.util.Arrays;

public class Task315 {
    public static void main (String[] args) {
        String a = " gfg   gfdde  548 ";
        String b = a.trim().replaceAll("\\s+", " ");
        System.out.println(b);
    }
}
