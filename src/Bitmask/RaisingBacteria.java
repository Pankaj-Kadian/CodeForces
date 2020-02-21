package Bitmask;

import java.util.Scanner;
// 579A Problem Number
public class RaisingBacteria {
    // Count Set bits
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
