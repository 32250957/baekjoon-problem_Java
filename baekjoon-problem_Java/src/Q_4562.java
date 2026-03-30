import java.io.*;
import java.util.StringTokenizer;

public class Q_4562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int E = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(E < B) {
                wr.write("NO BRAINS\n");
            }
            else {
                wr.write("MMM BRAINS\n");
            }
        }
        wr.flush();
    }
}
