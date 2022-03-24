import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr =new int[N+1];
        int[] DP =new int[N+1];

        StringTokenizer st =new StringTokenizer(br.readLine()," ");
        DP[0]=1;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<N;i++){
            DP[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&DP[j]>=DP[i]) {
                    DP[i] = DP[j] + 1;
                }
            }

        }
        br.close();
        int max=0;

        for(int i=0;i<N;i++){
            if(max<DP[i]){
                max=DP[i];
            }
        }
        System.out.println(max);
    }
}
