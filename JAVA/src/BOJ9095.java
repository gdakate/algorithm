import java.util.Scanner;

public class BOJ9095 {
    public static int[] dp;
    public static int recursive(int num){
        if (num<=1)
            return 0;

        if(num==1)
            return 1;
        else if(num==2)
            return 2;
        else if(num==3)
            return 4;

        dp[num]=recursive(num-1)+recursive(num-2)+recursive(num-3);

        return dp[num];
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();

        dp=new int[N];

        int result=recursive(N);
        System.out.println(result);

    }


}
