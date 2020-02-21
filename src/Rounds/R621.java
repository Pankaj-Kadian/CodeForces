package Rounds;

import java.util.Scanner;

public class R621 {
    public static void ques1(){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int d = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= s.nextInt();
            }
            int ans = arr[0];
            int i=1;
            while(d>0 && i<arr.length && d>=i){
                if(arr[i]!=0){
                    ans = ans+1;
                    arr[i]--;
                    d=d-i;
                }else
                    i++;
            }
            System.out.println(ans);
            t--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int d = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= s.nextInt();
            }
            int ans=Integer.MAX_VALUE ;
            for(int i=0;i<n;i++){
                if(d%arr[i]==0){
                    if(d/arr[i]<ans){
                        ans=d/arr[i];
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]*2>d){
                    if(ans>2){
                        ans=2;
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
