import java.util.Scanner;

public class BOJ11727 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int dp[]=new int[n+1]; //이걸 왜 다 해주는건지?

        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]*2;
        }
        dp[n]%=10007;

        System.out.println(dp[n]);
    }
}
