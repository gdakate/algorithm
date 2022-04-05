import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ch4p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
//방향과 dx,dy 지정
        int[] way={0,1,2,3};
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        st= new StringTokenizer(bf.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());


        //map입력받아 지도 채우기
        int[][] map= new int[N][M];

        for(int i=0;i<N;i++){
            StringTokenizer st2= new StringTokenizer(bf.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st2.nextToken());
            }
        }
        int mydir=0;
        //지금 내 방향 위치 찾기
        for(int i=0;i<4;i++){
            if(w==way[i])
                mydir=i;
        }
        int count=0;
        //이동하기
        while(true){
            //왼쪽 보기
            int myd=(mydir+4)%4-1;
            //네방향 다 0이 없는경우
            if (map[x-1][y]!=0||map[x+1][y]!=0||map[x][y-1]!=0||map[x][y+1]!=0){
                mydir=(mydir+4)%4-2;
                int nx=x+dx[mydir]; int ny=y+dy[mydir];
                if(map[x][y]==1)
                    break;
                x=nx;y=ny;
                count++;
            }
            else if(map[x+dx[myd]][y+dx[myd]]==0){
                mydir=myd;
                map[x][y]=2;
                count++;
                x+=x+dx[mydir]; y+=y+dy[mydir];
            }
            else if(map[x+dx[myd]][y+dx[myd]]==2){
                mydir=myd;
            }


        }




    }
}
