package Chapter1;

public class Problem103Opt1 {
    
    static String replaceSpaces(char[] str, int trueLen) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLen; i++) {
            if(str[i] == ' ')
                spaceCount++;
        }
        System.out.println("Spaces: " + spaceCount);
//        THERE IS A FLAW HERE. THIS SOLUTION PROVIDED IN THE BOOK WILL NOT WORK IF THERE IS PRECEEDING SPACES!
        return "";
    } 
    
    public static void main(String[] args) {
        String s = "Mr John Smith     ";
        replaceSpaces(s.toCharArray(), 13);
    }
    
}
