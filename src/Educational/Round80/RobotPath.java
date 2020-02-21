package Educational.Round80;

import java.util.HashMap;
import java.util.Scanner;

public class RobotPath {
    public static String result(int[][] arr,int xMax,int yMax,int n,int i,int j,String ans){
        if(n==0){
            return ans;
        }
        if(i>1000 || i>xMax || j>1000 || j>yMax){
            return "F";
        }
        if(arr[i][j]==1){
        //    arr[i][j]=0;
            n--;
        }
        String ans1=result(arr,xMax,yMax,n,i+1,j,ans+"R");
        String ans2=result(arr,xMax,yMax,n,i,j+1,ans+"U");

       // arr[i][j]=0;
      //  n++;
        if(ans1.equals("F") || ans2.equals("F")){
            return "F";
        }
        if(ans1.equals("F")){
            return ans2;
        }
        if(ans2.equals("F")){
            return ans1;
        }
        if(ans1.length()>ans2.length()){
            return ans2;
        }
        return ans1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int[][] arr = new int[1001][1001];
            int xMax=Integer.MIN_VALUE;
            int xMin=Integer.MAX_VALUE;
            int yMin=Integer.MAX_VALUE;
            int yMax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int x = s.nextInt();
                int y = s.nextInt();
                arr[x][y]=1;
                if(x>xMax){
                    xMax=x;
                }
                if(y>yMax){
                    yMax=y;
                }
                if(x<xMin){
                    xMin=x;
                }
                if(y<yMin){
                    yMin=y;
                }
            }
            String ans = result(arr,xMax,yMax,n,0,0,"");
            if(ans.charAt(0)=='F'){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(ans);
            }
        t--;
        }
    }
}
