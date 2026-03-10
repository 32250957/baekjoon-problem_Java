import java.io.*;
import java.util.*;

class Node1 {
    int data;
    List<Node1> list = new ArrayList<>();

    Node1(int data) {
        this.data = data;
    }
}

public class Q_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Node1> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N-1;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            if(node1 == 1) {
                
            }
        }
    }
}
