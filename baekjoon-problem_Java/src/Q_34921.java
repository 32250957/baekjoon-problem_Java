import java.io.*;
import java.util.StringTokenizer;

public class Q_34921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int result = 10 + 2 * (25 - A + T);

        if(result<=0) {
            wr.write("0");
        }
        else {
            wr.write(result+"");
        }
        wr.flush();
    }
}
