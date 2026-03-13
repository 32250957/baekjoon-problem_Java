import java.io.*;
import java.util.*;

public class Q_11725 {

    static void BFS(List graph, BufferedWriter wr) throws IOException{


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());

        List<Integer>[] graph = new ArrayList[N+1];

        for(int i=1;i<N+1;i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=1;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        List<Integer> parents = new ArrayList<>();

    }
}
