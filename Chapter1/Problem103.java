package Chapter1;

import java.util.Scanner;

public class Problem103 {
    
    static String urilify(String str) {
        StringBuilder sb = new StringBuilder();
        int whiteSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(current != ' ') {
                sb.append(current);
                whiteSpaces = 0;
            } else {
                whiteSpaces++;
                if(whiteSpaces == 1 && i != 0 && i != str.length() - 1) {
                    sb.append("%20");
                }
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
        String str = "      Mr     John     Smith    ";
        
        System.out.println(urilify(str));
        
    }
}
