package Chapter1;

import java.util.Scanner;

class MyHashMap {
    int count[] = new int[26];
    
    int getHash(char key) {
        int index = key % 97;
        return index;
    }
    
    void storeCount(char key) {
        int index = getHash(key);
        if(count[index] == 0) {
            count[index] = 1;
        } else {
            count[index] += 1;
        }
    }
    
    boolean checkDuplicate() {
        for(int x : count) {
            if(x > 1) {
                return false;
            }
        }
        return true;
    }
}

public class Problem101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();
        
        if(!s.matches("^[a-zA-Z]*$")) {
            System.out.println("Not a valid String");
            return;
        }
        
        int length = s.length();
        
        MyHashMap myMap = new MyHashMap();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            myMap.storeCount(c);
        }
        
        if(myMap.checkDuplicate()) {
            System.out.println("String has all unique characters");
        } else {
            System.out.println("String is not unique.");
        }
    }
}
