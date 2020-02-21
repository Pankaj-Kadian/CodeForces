package Bitmask;

import java.util.Scanner;

//Problem 202A
public class LLPS {
    //Kuch nahi hai question mai bas normally sochega toh ho jayega juggaad tha kyuki agar isme ye hai largest lexo char nikal
    //vo toh hoga hi palindrome aur agar isse pade size ka palindrome hona hai toh vo letter bhi aana chaiye kyuki palindrome hai
    // toh iss case jaise ki vo largest lexo hai toh vo baaki se bada hoga so vo khud ke saath hi milke palindrome bana lega
    // O(n) sol
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int index=-1;
        int ascii=96;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>ascii){
                index=i;
                ascii=str.charAt(i);
            }
        }
        int count=0;
        for(int i=index;i<str.length();i++){
            if(ascii==str.charAt(i)){
                count++;
            }
        }
        String ans="";

        for(int i=0;i<count;i++){
            ans=ans+str.charAt(index);
        }
        System.out.println(ans);
    }
}
