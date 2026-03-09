import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Node {
    String data;
    Node left;
    Node right;

    Node(String data) {
        this.data = data;
    }
}

public class Q_1991 {
    static void preorder(Node node, BufferedWriter wr) throws IOException{
        if(node == null) {
            return;
        }

        wr.write(node.data);
        preorder(node.left, wr);
        preorder(node.right, wr);
    }

    static void inorder(Node node , BufferedWriter wr) throws IOException {
        if(node == null) {
            return;
        }

        inorder(node.left, wr);
        wr.write(node.data);
        inorder(node.right, wr);
    }

    static void postorder(Node node , BufferedWriter wr) throws IOException {
        if(node == null) {
            return;
        }

        postorder(node.left, wr);
        postorder(node.right, wr);
        wr.write(node.data);
    }

    public static void main(String[] args) throws IOException {
        Map<String, Node> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String root = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            if(!map.containsKey(root) && !root.equals(".")) {
                map.put(root, new Node(root));
            }

            if(!map.containsKey(left) && !left.equals(".")) {
                map.put(left, new Node(left));
            }

            if(!map.containsKey(right) && !right.equals(".")) {
                map.put(right, new Node(right));
            }

            map.get(root).left = map.get(left);
            map.get(root).right = map.get(right);
        }

        preorder(map.get("A"), wr);
        wr.write("\n");
        inorder(map.get("A"), wr);
        wr.write("\n");
        postorder(map.get("A"), wr);

        wr.flush();
    }
}
