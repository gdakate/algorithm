import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N+1];
        int DP[]=new int[N+1];
        arr[0]=Integer.parseInt(br.readLine());
        DP[0]=1;
        for(int i=1;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
            DP[i]=DP[i-1];
            if(arr[i]<arr[i-1])
                DP[i]++;
        }
        br.close();
        System.out.println(DP[N-1]);


    }
}
