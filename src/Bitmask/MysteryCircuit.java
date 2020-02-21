package Bitmask;
//Problem 1145C
import java.util.Scanner;

public class MysteryCircuit {
    public static void main(String[] args) {
        // Just have to think of how the output is generated

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int n2 =0;
        int i=3;
        while(n>0){
            int b = (n&1);
            n2=n2+(b<<i);
            i--;
            n=n>>1;
        }
    //    System.out.println(n2);
        if(n2==0){
            n2=16;
        }
        n2=n2-1;
        int n3=0;
        i=3;
        while(n2>0){
            int b = (n2&1);
            n3=n3+(b<<i);
            i--;
            n2=n2>>1;
        }
        System.out.println(n3);
    }
}
