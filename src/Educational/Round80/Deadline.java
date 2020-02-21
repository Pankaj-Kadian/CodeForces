package Educational.Round80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Deadline {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int d=s.nextInt();
            if(n>=d){
                System.out.println("YES");
            }else{
                int x = 0;
                int val = d/n;
                int flag=0;
                while(x<=n){
                    int val2= x +( d/(x+1));
                    if(d%(x+1)!=0){
                        val2++;
                    }
                    if(val2<=n){
                        flag=1;
                        break;
                    }
                    x++;
                }
                if(flag==0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
            t--;
        }
    }
}
