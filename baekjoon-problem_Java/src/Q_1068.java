import java.io.*;
import java.util.*;

public class Q_1068 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer>[] Tree = new ArrayList[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<=N;i++) {
            Tree[i] = new ArrayList<>();
        }

        for(int i=0;i<N;i++) {
            int input = Integer.parseInt(st.nextToken());

            Tree[input+1].add(i);
        }
        for(int i=0;i<N+1;i++) {
            if(Tree[i] != null) {
                wr.write(Tree[i]+".\n");;
            }
        }

        int del = Integer.parseInt(br.readLine());
        for(int trees : Tree[del+1]) {
            Tree[trees] = null;
        }

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for(int i=0;i<N+1;i++) {
            if(Tree[i] != null) {
                wr.write(Tree[i]+"\n");;
                count++;
            }
        }
        wr.write(count+"");
        wr.flush();
    }
}
