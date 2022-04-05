import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch4p2answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        int col=st.charAt(0)-'a'+1;//이 방법 생각
        int row= st.charAt(1)-'0'; //이 방법 생각

        int [] dx={-2,-2,2,2,-1,1,-1,1};
        int [] dy={-1,1,1,-1,-2,-2,2,2};
        int count=0;
        for(int i=0;i<8;i++){
            int ndx=dx[i]+row;
            int ndy=dy[i]+col;
            if(ndx>=1&&ndx<=8&&ndy>=1&&ndy<=8)
                count++;
        }

        System.out.println(count);
    }
}
