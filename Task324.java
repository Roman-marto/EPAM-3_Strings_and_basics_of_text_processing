public class Task324 {
    public static void main (String[] args) {
        String a = "Информатика";
        int a1 = a.indexOf('т');
        int a2 = a.indexOf('о');
        int a3 = a.indexOf('р');
        String b = a.substring(a1, a1 + 1) +
                   a.substring(a2, a2 + 1) +
                   a.substring(a3, a3 + 1) +
                   a.substring(a1, a1 + 1);
        System.out.println(b);


    }
}
