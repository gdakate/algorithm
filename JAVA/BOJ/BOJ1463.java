import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class BOJ1463 {
public static int[] dp;
public static int recursive(int num){
    if(num==1)
        return 0;
    dp[num]=recursive(num-1)+1;
    if(num%3==0){
        int save=recursive(num/3)+1;
        if(save<dp[num])
            dp[num]=save;
    }
    else if(num%2==0){
        int save=recursive(num/2)+1;
        if(save<dp[num])
            dp[num]=save;
    }
    return dp[num];

}

public static void main(String args[])throws IOException {

    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
    int N= rd.read();
    dp=new int[N+1];

    System.out.println(recursive(N));
}
}
