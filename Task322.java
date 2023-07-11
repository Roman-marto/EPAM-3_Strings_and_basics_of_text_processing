public class Task322 {
    public static void main (String[] args){
        String a = "avafgvdtarwa";
        StringBuilder str = new StringBuilder();
        char c = 'a';
        char q = 'b';
        for (int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if (ch == c) {
                str.append(ch);
                str.append(q);
            }
            else {
                str.append(ch);
            }
        }
        System.out.println(str);
    }
}
