// 숫자 카드 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch3p3again {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        int[][] card=new int[N][M];

        for(int i=0;i<N;i++){
            StringTokenizer st1=new StringTokenizer(bf.readLine());
            for(int j=0;j<M;j++){
                card[i][j]=Integer.parseInt(st1.nextToken());
            }
        }

       int min=0;

        for(int i=0;i<N;i++){
            int  Min=10;
            for(int j=0;j<M;j++){
                if(card[i][j]<Min)
                    Min=card[i][j];
            }
            if(min<Min)
                min=Min;
        } //안에서 바로 비교

//        int Max=0;
//        for(int i=0;i<N;i++){
//            if(min[i]>Max)
//                Max=min[i];
//        }

        System.out.println(min);




    }
}
