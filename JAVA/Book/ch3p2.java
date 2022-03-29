//큰수의 법칙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class ch3p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(bf.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int count=0;
        int[] arr=new int[N];

        StringTokenizer st1 =new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        int max=0;
        int next=0;
        for(int i=0;i<N;i++){
            if(arr[i]>max) {
                next=max;
                max = arr[i];
            }
            else if(arr[i]<max&&arr[i]>next)
                next=arr[i];
        }
        System.out.println(max+" "+next+"\n");

        while(K<M){
           count+= max*K+next;
           M-=K+1;
           System.out.println(M+" "+count+"\n");
        }
        if(M!=0)
        System.out.println(M);
        count+=max*M;

        System.out.println(count);




    }
}
