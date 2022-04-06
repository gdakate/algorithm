import java.util.*;
import java.io.*;

public class GOCC2021InternNum1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] array=new int[N];
        int q= Integer.parseInt(br.readLine());
        int[][] query=new int[q][2];
        //배열 입력받기
        for(int i=0;i<N;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }
        //쿼리 입력받기
        for(int i=0;i<q;i++){
                StringTokenizer st2=new StringTokenizer(br.readLine());
                query[i][0]=Integer.parseInt(st2.nextToken());
                query[i][1]=Integer.parseInt(st2.nextToken());
        }
        int[] m=new int[q];
        for(int i=0;i<q;i++){
            int max=0;
            for(int j=0;j<N;j++){
                if(array[j]<query[i][1]){
                    //XOR연산
                    int xor=array[j]^query[i][0];
                    if(max<xor){
                        max=xor;
                        m[i]=array[j];
                    }
                }

            }
            if(max==0)
                System.out.println(-1);
            else
                System.out.println(m[i]);
        }

    }
}
