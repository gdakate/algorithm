//DFS 자바코드로 표현
//재귀 이용하여 간결하게 표현


import java.util.ArrayList;

public class ch5DFS {
    public static boolean[] visited =new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x){
        //현재 방문노드 처리
        visited[x]=true;
        System.out.println(x+"");
        //현재 노드와 연결된 다른 노드 재귀적 방문
        for(int i=0;i<graph.get(x).size();i++){
            int y=graph.get(x).get(i);
            if(!visited[y])
                dfs(y);
        }
    }

    public static void main(String[] args) {
        //그래프 초기화
        for(int i=0;i<9;i++){
            graph.add(new ArrayList<Integer>());
        }
        //노드 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);
        //...등등 반복

        dfs(1);
    }
}
