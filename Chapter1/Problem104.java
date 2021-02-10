package Chapter1;

public class Problem104 {
    static boolean checkPalindrome(String s) {
        char[] str = s.toCharArray();
        int count[] = new int[26];
        int index;
        for(char c : str) {
            if(c == ' ') {
                continue;
            }
            index = c % 97;
            count[index]++;
        }
//        for(int x : count)
//            System.out.print(x + ", ");
        int oddCount = 0;
        
        for(int x : count) {
            if(x % 2 != 0) {
                oddCount++;
            }
        }
        
        return oddCount <= 1;
    }
    
    public static void main(String[] args) {
        String s = "ability s abilityv";
        if(checkPalindrome(s.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}