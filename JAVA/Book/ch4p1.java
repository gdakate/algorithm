// 상하좌우
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch4p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(bf.readLine());
        String[] move= bf.readLine().split(" ");

        char moves[]={'L','R','U','D'};
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};

        int x=1; int y=1;
        for(int i=0;i<move.length;i++){
            char plan=move[i].charAt(0);
            int nx=-1,ny=-1;
            for(int j=0;j<4;j++){
                if(plan==moves[j]){
                    nx=x+dx[j];
                    ny=y+dy[j];
                }
            }
            if (nx<1||nx>N||ny<1||ny>N)
                continue;
            x=nx;
            y=ny;
        }
        System.out.println(x+","+y);

    }
}
