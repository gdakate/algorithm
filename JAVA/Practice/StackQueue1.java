class StackQueue1 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] left=new int[progresses.length];
        for(int i=0;i<progresses.length;i++){
            if((100-progresses[i])%speeds[i]==0)
                left[i]=(100-progresses[i])/speeds[i];
            else
                left[i]=(100-progresses[i])/speeds[i]+1;
        }
        int max=left[0];
        int N=0;
        for(int i=0;i<left.length;i++){
            if(max<left[i]){
                N++;
                max=left[i];
            }
        }
        int[] answer = new int[N+1];
        int num=left[0];
        int count=0;
        for(int i=0,j=0;i<left.length;i++){
            if(left[i]<=num)
                count++;
            else{
                answer[j]=count;
                j++;
                count=0;
                num=left[i];
                count++;
            }
            if(i==left.length-1){
                answer[j]=count;

            }
        }



        return answer;
    }


    public static void main(String[] args) {
       int[] progresses={93,30,55};
       int[] speeds={1,30,5};
       solution(progresses, speeds);
    }



}
