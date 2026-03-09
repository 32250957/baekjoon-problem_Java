import java.io.*;
import java.util.StringTokenizer;

public class Q_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] num = new int[N+1];
        for (int i = 0; i < N + 1; i++) {
            num[i] = i;
        }

        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            for (int j = i * i; j < N + 1; j += i) {
                if (num[j] != 0) {
                    num[j] = 0;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (num[i] != 0 && num[i] != 1) {
                wr.write(num[i] + "\n");
            }
        }
        wr.flush();
    }
}
