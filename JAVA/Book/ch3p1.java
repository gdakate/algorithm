//ch03 그리디 - 거스름돈 문제
//거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재함
//손님에게 거슬러줘야 할 돈이 N원 일 때 거슬러 줘야 할 동전의 최소 개수를 구하라. 단 N은 항상 10의 배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch3p1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(bf.readLine());

        int count=0;
        int coin[]={500,100,50,10};

        for(int i=0;i<coin.length;i++){
            count+=N/coin[i];
            N%=coin[i];
                    }

        System.out.println(count);
    }




}
