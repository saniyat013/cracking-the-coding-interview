package Chapter1;

import java.util.Scanner;

public class Problem102Opt2 {
    
    static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        int count[] = new int[128];
        
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
        }
        
        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i)]--;
            if(count[b.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String a = scan.next();
        String b = scan.next();
        
        System.out.println(isPermutation(a, b));;
        
    }
}
