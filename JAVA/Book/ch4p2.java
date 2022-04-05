import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch4p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        char n=st.charAt(0);
        int m=Character.getNumericValue(st.charAt(1));
        char[] alp={'a','b','c','d','e','f','g','h'};
        int[] num={1,2,3,4,5,6,7,8};
        int count=0;
        for(int i=0;i<alp.length;i++){
            if(n==alp[i]){
                if(num[i]<7&&num[i]>2&&m<8&&m>1)
                    count+=4;
                else if((num[i]>6||num[i]<3)&&m<8&&m>1)
                    count+=2;
                else if((m>6||m<3)&&num[i]>1&&num[i]<8)
                    count+=2;
            }
        }
        System.out.println(count);
    }
}
