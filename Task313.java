public class Task313 {
    public static void main (String[] args) {
        String a = "fdf d45dsf85sdfsdfg451sdg5464s1df3sg48w64efcs 5 4 ";
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if (Character.isDigit(ch)) {
                str.append(ch);
                str.append(' ');
                count++;
            }
        }
        System.out.println(str);
        System.out.println("Всего цифр = " + count);
    }
}
