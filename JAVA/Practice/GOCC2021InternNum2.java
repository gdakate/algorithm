import java.io.*;
import java.util.*;
public class GOCC2021InternNum2 {
    public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(br.readLine());
    int [] N=new int[2];
    int[] X= new int[2];
    int[] Y=new int[2];
    int[]count=new int[T];

    for(int i=0;i<T;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        N[i]=Integer.parseInt(st.nextToken());
        X[i]=Integer.parseInt(st.nextToken());
        Y[i]=Integer.parseInt(st.nextToken());

        int j=1;
        while(true){
            if(X[i]*Y[i]*j<Math.pow(10,N[i])){
                count[i]++;
                j++;}
            else
                break;

        }
    }
    for(int i=0;i<T;i++){
        System.out.println(count[i]);}





    }
}
