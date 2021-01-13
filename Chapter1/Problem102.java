package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem102 {

    static String sort(String str) {
        char x[] = str.toCharArray();
        Arrays.sort(x);
        return new String(x);
    }

    static boolean isPermutaion(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        System.out.println(isPermutaion(a, b));
    }
}
