import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();        
        int b = a.length();
        a = a.trim();
        if(1 <= b && b <=1000000){
        System.out.print(a);
            sc.close();
        }
    }
}