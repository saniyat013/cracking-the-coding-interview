package Chapter1;

import java.util.Scanner;

public class Problem101Opt1 {

    static boolean checkDuplicate(String str) {
        if (str.length() > 128) {
            return false;
        }
        
        boolean charSet[] = new boolean[128];
        
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(charSet[val])
                return false;
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(checkDuplicate(str));;
    }
}
