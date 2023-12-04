import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();        
        int n = sc.nextInt();      
        int len = str.length();
        if(1<= len && len <=10){
            for(int i =1; i<=n; i++){              
                System.out.print(str);
            }
        }
    }
}