import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        wr.write("Gnomes:\n");

        for(int i=0;i<N;i++) {
            int[] input = new int[3];
            int[] check = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0;j<3;j++) {
                int in = Integer.parseInt(st.nextToken());

                input[j] = in;
                check[j] = in;
            }

            Arrays.sort(check);

            if(check[0] == input[1] || check[2] == input[1]) {
                wr.write("Unordered\n");
            }
            else {
                wr.write("Ordered\n");
            }
        }

        wr.flush();
    }
}
