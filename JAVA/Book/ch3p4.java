//1이 될때까지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch3p4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int count=0;

        while (true){
            if(N%K==0){
                N/=K;
                count++;
            }
            else if(N==1)
                break;
            else{
                N-=1;
                count++;
            }

        }
        System.out.println(count);
    }
}
