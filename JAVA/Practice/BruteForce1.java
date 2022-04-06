import java.util.*;
public class BruteForce1 {
    public int[] solution(int[] answers) {
        int[] answer={};
        int[] stu1={1,2,3,4,5};
        int[] stu2={2,1,2,3,2,4,2,5};
        int[] stu3={3,3,1,1,2,2,4,4,5,5};
        int answer1=0,answer2=0,answer3=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==stu1[i%stu1.length]) answer1++;
            if(answers[i]==stu2[i%stu2.length]) answer2++;
            if(answers[i]==stu3[i%stu3.length]) answer3++;
        }
        //최대값 구하기
        int max= Math.max(Math.max(answer1,answer2),answer3);

        //리스트 만들기
        ArrayList<Integer> list= new ArrayList<Integer>();
        if(max==answer1) list.add(1);
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);

        //answer배열 만들어서 넣기
        answer= new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }


        return answer;
    }
}