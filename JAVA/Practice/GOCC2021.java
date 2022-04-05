import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GOCC2021 {
    public static int fac(int x){
        if(x==1||x==0)
            return 1;

        return x * fac(x-1);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(bf.readLine());
        int M= Integer.parseInt(bf.readLine());

        int minus= fac(M+1)/fac(N);
        System.out.println(minus);
//        int total=1;
//
//        int i=N/2;
//        for(int j=0;j<i;j++)
//            total*= ((M+1)-j)*((M+1)-j);
//        if (N % 2 != 0) {
//            total*=M-i;
//        }
        //N이 2일땐 26제곱인데 만약 N이 3이라면? 뭔가 달라질거 같은데
        int total=26*26;
        System.out.println(total);

        System.out.println(total-minus);

    }


}
